package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConfigObject {
    String Name;
    List<ConfigAction> Methods;

    public ConfigObject(String Name){
        this.Name = Name;
        Methods = new ArrayList<ConfigAction>();
    }

    public void addMethod(ConfigAction Method) {
        this.Methods.add(Method);
    }

}
