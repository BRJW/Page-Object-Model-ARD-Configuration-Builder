package com.company;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.util.ArrayList;
import java.util.List;

public class ParsedClass {
    String Name;
    List<ConfigAction> Methods;

    public ParsedClass(String Name){
        this.Name = Name;
        Methods = new ArrayList<ConfigAction>();
    }

    public void addMethod(ConfigAction Method) {
        this.Methods.add(Method);
    }

}
