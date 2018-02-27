package com.company;

import org.apache.commons.io.FileUtils;
//Because apparently having inbuilt capturing of files/directories recursively is too much to ask for.

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileGatherer {
    //Nothing fancy to see here, get all files which have one of the specified extensions from our root directory, and all it's subdirectories recursively.
    //Naming standards seem to suffer here..
    public static List<String> GatherFiles(String RootDirectory, String[] SearchExtensions){

        List<String> Paths = new ArrayList<>();
        File Dir = new File(RootDirectory);
        try {
            System.out.println("Getting all relevant files in " + Dir.getCanonicalPath()
                    + " including those in subdirectories");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<File> files = (List<File>) FileUtils.listFiles(Dir, SearchExtensions, true);
        for (File file : files) {
            try {
                System.out.println("file: " + file.getCanonicalPath());
                Paths.add(file.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Return all of the file paths we want to parse for classes.
        return Paths;
    }

}
