package com.company;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class FileParser
{
    //So all of this needs to be made into an interface - this is all specific to Java once we're at 'Class Visitor"
    public static List<ParsedClass> Parse(String Path, String Language) throws Exception {

        FileInputStream In = new FileInputStream(new File(Path));
        String FileContents = IOUtils.toString(In, "UTF-8");
        In.close();

        List<ParsedClass> ParsedClasses = new ArrayList<ParsedClass>();

        //There must be a less stupid way.
        switch (Language) {
            case "Java":
                ParsedClasses = JavaLanguageParser.Parse(FileContents);
                break;
            default:
                throw new InputMismatchException("No implemented language chosen.");
        }

        return ParsedClasses;
    }
}

