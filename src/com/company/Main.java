package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String InputDir;
        String OutputDir;
        String Language;
        String[] Extensions;

       //Import Arguments
        try {
            InputDir = args[0];
            OutputDir = args[1];
            Language = args[2];
            Extensions = Arrays.copyOfRange(args, 3, args.length);
        }
        catch (Exception e){
            System.out.println("You entered inappropriate parameters - the parameters should be: InputDir OutputDir Language Extensions[....]");
            System.out.println("Press any key to exit..");
            e.printStackTrace();
            System.in.read();
            return; //end
        }

        //Get all of the files with the specified extensions.
        List<String> Paths;
        try{
            Paths = FileGatherer.GatherFiles(InputDir, Extensions);
        }
        catch (IOException e){
            System.out.println("Failed to gather all of the files successfully from the specified InputDir");
            System.out.println("Press any key to exit..");
            e.printStackTrace();
            System.in.read();
            return;
        }

        List<ParsedClass> AllParsedClasses = new ArrayList<ParsedClass>();

        //For each file, parse all of the classes within that file.
        try {
            for (String Path : Paths) {
                List<ParsedClass> ParsedClasses = FileParser.Parse(Path, Language);
                AllParsedClasses.addAll(ParsedClasses);
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
            Output = FileBuilder.BuildConfig(AllParsedClasses);
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
