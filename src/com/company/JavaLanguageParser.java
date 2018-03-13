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

public class JavaLanguageParser extends LanguageParser {

    public JavaLanguageParser(SupportedLanguages lang){
        super(lang);
    }

    public  List<ConfigObject> Parse(String FileContents){

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

                //Add instantiation method, and add it first to the list.
                VisitedClass.addMethod(createInstantiationMethod(VisitedClass));

                //For the parsed class, parse it for methods. (using JavaParser magic.
                classDeclaration.accept(new MethodVisitor(), VisitedClass);

                //Add the class to the list of all of the classes found for this .Java File...
                configObjects.add(VisitedClass);

            }
        }

        //I.e. the whole A a = new A(); biz
        //Again, do we use a void method, or return a string and do it inline in the parser?
        private ConfigAction createInstantiationMethod(ConfigObject ConfigObject) {
            String MethodName = ConfigObject.getName() + "_Instantiation";
            ConfigAction InstantiationMethod = new ConfigAction(MethodName);
            InstantiationMethod.setCodeSnippet(ConfigObject.getName() + " ~ObjName_" + ConfigObject.getName() + "~ = new " + ConfigObject.getName() + "();\n");
            return InstantiationMethod;
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
                Method.addParameter(new ParsedMethodParameter(ParameterName,ParameterType));
            }

            //Calculate the code snippet and apply it to the method we've found/created.
            Method.setCodeSnippet(genCodeSnippet(Method, ConfigObject));
            //Add the parsed method to the parsed class
            ConfigObject.addMethod(Method);

        }


        private String genCodeSnippet(ConfigAction Method, ConfigObject ConfigObject){
            String MethodCodeSnippet = "~ObjName_"+ ConfigObject.getName() + "~.";
            MethodCodeSnippet+= Method.getName() + "(";

            //Add in all of the parameters, naming by their name and type.
            for(ParsedMethodParameter Parameter : Method.getParameters()){
                //No need for string builder we don't have 1000000 arguments.. this loop will go round like 20 times max.
                MethodCodeSnippet+= "~" + Parameter.getType() + "_" + Parameter.getName() + "~";
                MethodCodeSnippet+=",";
            }

            //Remove the last comma.
            MethodCodeSnippet = MethodCodeSnippet.replaceAll(",$", "");
            // Close the brackets and add a line break at the end.
            MethodCodeSnippet+=");\n";
            return MethodCodeSnippet;
        }

    }
}
