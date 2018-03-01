package com.company;

import java.util.ArrayList;
import java.util.List;

public class ParsedMethod {
    String Name;
    List<ParsedMethodParameter> Parameters;

    ParsedMethod(String Name){
        this.Name = Name;
        Parameters = new ArrayList<ParsedMethodParameter>();
    }

    void AddParameter(ParsedMethodParameter Parameter){
        Parameters.add(Parameter);
    }


}
