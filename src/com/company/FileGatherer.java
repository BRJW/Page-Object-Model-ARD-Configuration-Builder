package com.company;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Because apparently having inbuilt capturing of files/directories recursively is too much to ask for.

public class FileGatherer {
    //Nothing fancy to see here, get all files which have one of the specified extensions from our root directory, and all it's subdirectories recursively.
    //Naming standards seem to suffer here..
    public static List<String> GatherFiles(String RootDirectory, String[] SearchExtensions) throws IOException{

        List<String> Paths = new ArrayList<>();
        File Dir = new File(RootDirectory);
        System.out.println("Getting all relevant files in " + Dir.getCanonicalPath()
                + " including those in subdirectories");

        List<File> files = (List<File>) FileUtils.listFiles(Dir, SearchExtensions, true);
        for (File file : files) {
                System.out.println("file: " + file.getCanonicalPath());
                Paths.add(file.getCanonicalPath());
        }
        //Return all of the file paths we want to parse for classes.
        return Paths;
    }

}
