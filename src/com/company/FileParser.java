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
    public static List<ConfigObject> Parse(String Path, SupportedLanguages language) throws Exception {

        FileInputStream In = new FileInputStream(new File(Path));
        String FileContents = IOUtils.toString(In, "UTF-8");
        In.close();

        List<ConfigObject> configObjects = new ArrayList<ConfigObject>();

        try {
            LanguageParser parser = LanguageParserFactory.getLanguageParser(language);
            configObjects = parser.Parse(FileContents);
        } catch (Exception e){
            System.out.println("Language not implemented");
            System.out.println(e.getMessage());
        }

        return configObjects;
    }
}


