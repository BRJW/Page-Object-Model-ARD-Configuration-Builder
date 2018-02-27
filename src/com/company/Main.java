package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String InputDir;
        String OutputDir;
        String[] Extensions;

        //Put in some better checking for this..
        try {
            InputDir = args[0];
            OutputDir = args[1];
            Extensions = Arrays.copyOfRange(args, 2, args.length);
        }
        catch (Exception e){
            System.out.println("You entered inappropriate parameters, press any key to exit..");
            System.in.read();
            return; //end
        }

        //Get all of the files with the specified extensions.
        List<String> Paths = FileGatherer.GatherFiles(InputDir, Extensions);

        List<ParsedClass>AllParsedClasses = new ArrayList<ParsedClass>();

        //For each file, parse all of the classes within that file.
        for(String Path : Paths){
            List<ParsedClass> ParsedClasses = FileParser.Parse(Path);
            AllParsedClasses.addAll(ParsedClasses);
        }

        //Build the file, print for debug.
        String Output = FileBuilder.BuildConfig(AllParsedClasses);
        System.out.print(Output);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            //Default name, could become an option.
            new FileOutputStream(OutputDir + "POMconfig.config"), "utf-8"))) {
            writer.write(Output);
            writer.close();
        }
        catch (IOException ex) {
            // report
        }
    }
}
