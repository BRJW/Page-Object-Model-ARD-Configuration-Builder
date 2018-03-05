package com.company;

import org.apache.commons.cli.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String InputDir;
        String OutputDir;
        String[] Extensions;
        SupportedLanguages Language;

        try {
            CliParser cliParser = new CliParser(args);
            InputDir = cliParser.getInputDir();
            OutputDir = cliParser.getOutputDir();
            Language = cliParser.getLanguage();


        }  catch  (Exception e) {
            System.out.println("Press any key to exit..");
            System.in.read();
            return;
        }

        //Get all of the files with the specified extensions.
        List<String> Paths;
        try{
            Paths = FileGatherer.GatherFiles(InputDir, Language.getExtension());
        }
        catch (IOException e){
            System.out.println("Failed to gather all of the files successfully from the specified InputDir");
            System.out.println("Press any key to exit..");
            e.printStackTrace();
            System.in.read();
            return;
        }

        List<ConfigObject> allConfigObjects = new ArrayList<ConfigObject>();

        //For each file, parse all of the classes within that file.
        try {
            for (String Path : Paths) {
                List<ConfigObject> configObjects = FileParser.Parse(Path, Language);
                allConfigObjects.addAll(configObjects);
            }
        }
        catch (Exception e){
            System.out.println("Failed to read some of the files specified");
            System.out.println("Press any key to exit..");
            e.printStackTrace();
            System.in.read();
            return;
        }

        //Build the file, print for debug.
        String Output;
        try {
            Output = FileBuilder.BuildConfig(allConfigObjects);
            System.out.print(Output);
        }
        catch(Exception e){
            System.out.println("Building the configuration failed, presumably due to some XML error.. Or during conversion back to string..");
            System.out.println("Press any key to exit..");
            e.printStackTrace();
            System.in.read();
            return;
        }


        //Write file to the outputdir
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            //Default name, could become an option.
            new FileOutputStream(OutputDir + "POMconfig.config"), "utf-8"))) {
            writer.write(Output);
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Writing to the file system failed!");
            System.out.println("Press any key to exit..");
            e.printStackTrace();
            System.in.read();
            return;
        }


    }
}
