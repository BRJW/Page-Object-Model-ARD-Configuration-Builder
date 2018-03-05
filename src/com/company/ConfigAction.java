package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConfigAction {
    String Name;
    List<ParsedMethodParameter> Parameters;

    ConfigAction(String Name){
        this.Name = Name;
        Parameters = new ArrayList<ParsedMethodParameter>();
    }

    void AddParameter(ParsedMethodParameter Parameter){
        Parameters.add(Parameter);
    }


}
