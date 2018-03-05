package com.company;

import org.apache.commons.cli.*;

import java.io.File;

public class CliParser {

    private String[] args;
    private Options options;

    private String inputDir;
    private String outDir;
    private SupportedLanguages language;



    public CliParser( String[] args) throws ParseException
    {
        this.args = args;

        options = new Options();

        //build options
        Option inputOption = Option.builder("i")
                .numberOfArgs(1)
                .desc("Required - Input file directory")
                .longOpt("input")
                .build();
        options.addOption(inputOption);

        Option outputOption = Option.builder("o")
                .numberOfArgs(1)
                .desc("Required - Output file directory")
                .longOpt("output")
                .build();
        options.addOption(outputOption);

        Option languageOption = Option.builder("l")
                .numberOfArgs(1)
                .desc("Required - Language to parse. Supported languages are: " + SupportedLanguages.getSupoortedLanguagesStr())
                .longOpt("language")
                .build();
        options.addOption(languageOption);

        Option helpOption = Option.builder("h")
                .numberOfArgs(0)
                .desc("Print Help")
                .longOpt("help")
                .build();
        options.addOption(helpOption);


        //Parese the cmd line
        CommandLineParser parser = new DefaultParser();
        try{
            CommandLine line = parser.parse(options, args);

            if(line.hasOption(helpOption.getOpt()) || args.length == 0) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("ARD Config Builder", options);
                throw new ParseException("");
            }

            if(!line.hasOption(inputOption.getOpt()) || !line.hasOption(outputOption.getOpt()) || !line.hasOption(languageOption.getOpt())){
                System.out.println("Missing Required Fields");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("ARD Config Builder", options);
                throw new ParseException("");
            }

            try{
                this.language = SupportedLanguages.getSupportedLanguage(line.getOptionValue(languageOption.getOpt()));
            } catch (Exception e){
                System.out.println(e.getMessage());
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("ARD Config Builder", options);
                throw new ParseException("");
            }

            this.inputDir = line.getOptionValue(inputOption.getOpt());
            File file=new File(this.inputDir);
            if(!file.isDirectory())
                throw new ParseException("Input directory is not a valid directory.");

            this.outDir = line.getOptionValue(outputOption.getOpt());
            file = new File(this.outDir);
            if(!file.isDirectory())
                throw  new ParseException("Output directory is not a valid directory.");




        } catch (ParseException e) {
            System.err.println("Parsing failed.  Reason: " + e.getMessage());
            throw new ParseException("");
        }




    }

    public String getInputDir(){
        return inputDir;
    }
    public String getOutputDir(){
        return  outDir;
    }
    public SupportedLanguages getLanguage(){
        return language;
    }
}
