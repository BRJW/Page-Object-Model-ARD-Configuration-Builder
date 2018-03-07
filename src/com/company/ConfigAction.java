package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConfigAction {

    private String Name;
    private List<ParsedMethodParameter> Parameters;
    private String CodeSnippet;

    public String getName() {
        return Name;
    }

    //never used
    public void setName(String name) {
        Name = name;
    }

    public String getCodeSnippet() {
        return CodeSnippet;
    }

    public void setCodeSnippet(String codeSnippet) {
        CodeSnippet = codeSnippet;
    }

    ConfigAction(String Name){
        this.Name = Name;
        Parameters = new ArrayList<ParsedMethodParameter>();
        CodeSnippet = ""; //in the worst case we have an empty code snippet. - should we have a more explicit failure?
    }

    public void addParameter(ParsedMethodParameter Parameter){
        Parameters.add(Parameter);
    }

    public List<ParsedMethodParameter> getParameters() {
        return Parameters;
    }

    //Getters and setters yes or no?
}


