package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConfigObject {

    private String Name;
    private List<ConfigAction> Methods;

    public ConfigObject(String Name){
        this.Name = Name;
        Methods = new ArrayList<ConfigAction>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public void addMethod(ConfigAction Method) {
        this.Methods.add(Method);
    }
    public List<ConfigAction> getMethods() {return Methods;}

}
