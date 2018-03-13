package com.company;

public class ParsedMethodParameter {
    private String Name;
    private String Type;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }



    public ParsedMethodParameter(String Name, String Type){
        this.Name = Name;
        this.Type = Type;
    }

}
