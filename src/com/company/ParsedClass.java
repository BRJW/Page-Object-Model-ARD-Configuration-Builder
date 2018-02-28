package com.company;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.util.ArrayList;
import java.util.List;

public class ParsedClass {
    String Name;
    List<ParsedMethod> Methods;

    public ParsedClass(String Name){
        this.Name = Name;
        Methods = new ArrayList<ParsedMethod>();
    }

    public void addMethod(ParsedMethod Method) {
        this.Methods.add(Method);
    }

}
