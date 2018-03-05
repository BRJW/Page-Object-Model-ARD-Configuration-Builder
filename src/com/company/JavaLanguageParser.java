package com.company;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.ArrayList;
import java.util.List;

public class JavaLanguageParser{

    public static List<ConfigObject> Parse(String FileContents){

        CompilationUnit cu;
        cu = JavaParser.parse(FileContents);
        List<ConfigObject> configObjects = new ArrayList<>();
        cu.accept(new ClassVisitor(), configObjects);
        return configObjects;
    }

    private static class ClassVisitor extends VoidVisitorAdapter<List<ConfigObject>> {

        @Override
        public void visit(ClassOrInterfaceDeclaration classDeclaration, List<ConfigObject> configObjects){

            //Only retrieve public classes.. perhaps make an option
            if(classDeclaration.isPublic())
            {
                //Get the name
                String ClassName = classDeclaration.getNameAsString();

                //Create a ConfigObject from the name of the class we are visiting
                ConfigObject VisitedClass = new ConfigObject(ClassName);

                //For the parsed class, parse it for methods. (using JavaParser magic.
                classDeclaration.accept(new MethodVisitor(), VisitedClass);

                //Add the class to the list of all of the classes found for this .Java File...
                configObjects.add(VisitedClass);
            }
        }
    }

    //Lots of bad practices to be found here!
    private static class MethodVisitor extends VoidVisitorAdapter<ConfigObject>
    {
        @Override
        public void visit(MethodDeclaration methodDeclaration, ConfigObject ConfigObject)
        {
            //Get the name of the method we found by the JavaParser magic.
            String MethodName = methodDeclaration.getNameAsString();

            //Create a parsed method from the name
            ConfigAction Method = new ConfigAction(MethodName);

            //Get all the parameters
            NodeList<Parameter> Parameters = methodDeclaration.getParameters();
            for(Parameter Parm : Parameters){
                //For each parameter, create a ParsedMethodParameter from it's name and type.
                String ParameterName = Parm.getName().toString();
                String ParameterType = Parm.getType().toString();

                //Add the parsed parameter to the parsed method.
                Method.AddParameter(new ParsedMethodParameter(ParameterName,ParameterType));
            }

            //Add the parsed method to the parsed class
            ConfigObject.addMethod(Method);

        }

    }
}
