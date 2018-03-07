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
        CodeSnippet = ""; //in the worst case we have an empty code snippet. - should we have a more explicit failure? Nothing wrong with this - could throw methods that didn't parse correctly to a failure list 
    }

    void AddParameter(ParsedMethodParameter Parameter){
        Parameters.add(Parameter);
    }
    //Getters and setters yes or no?
    //Definetley use them! make the memembers private and then press cmd + N (on mac) you can generate them automtically
}
