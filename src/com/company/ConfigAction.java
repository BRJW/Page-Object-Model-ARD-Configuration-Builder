package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConfigAction {
    String Name;
    List<ParsedMethodParameter> Parameters;
    String CodeSnippet;

    ConfigAction(String Name){
        this.Name = Name;
        Parameters = new ArrayList<ParsedMethodParameter>();
        CodeSnippet = ""; //in the worst case we have an empty code snippet. - should we have a more explicit failure?
    }

    void AddParameter(ParsedMethodParameter Parameter){
        Parameters.add(Parameter);
    }
    //Getters and setters yes or no?
}
