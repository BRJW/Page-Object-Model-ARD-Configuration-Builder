package com.company;

import com.github.javaparser.*;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class FileParser
{
    //So all of this needs to be made into an interface - this is all specific to Java once we're at 'Class Visitor"
    public static List<ParsedClass> Parse(String Path) throws Exception
    {
        FileInputStream in = new FileInputStream(Path);
        CompilationUnit cu;
        cu = JavaParser.parse(in);
        in.close();
        List<ParsedClass> ParsedClasses = new ArrayList<>();
        cu.accept(new ClassVisitor(), ParsedClasses);
        return ParsedClasses;
    }

    private static class ClassVisitor extends VoidVisitorAdapter<List<ParsedClass>> {

        @Override
        public void visit(ClassOrInterfaceDeclaration classDeclaration, List<ParsedClass> ParsedClasses){

            //Only retrieve public classes.. perhaps make an option
            if(classDeclaration.isPublic())
            {
                //Get the name
                String ClassName = classDeclaration.getNameAsString();

                //Create a ParsedClass from the name of the class we are visiting
                ParsedClass VisitedClass = new ParsedClass(ClassName);

                //For the parsed class, parse it for methods. (using JavaParser magic.
                classDeclaration.accept(new MethodVisitor(), VisitedClass);

                //Add the class to the list of all of the classes found for this .Java File...
                ParsedClasses.add(VisitedClass);
            }
        }
    }

    //Lots of bad practices to be found here!
    private static class MethodVisitor extends VoidVisitorAdapter<ParsedClass>
    {
        @Override
        public void visit(MethodDeclaration methodDeclaration, ParsedClass ParsedClass)
        {
            //Get the name of the method we found by the JavaParser magic.
            String MethodName = methodDeclaration.getNameAsString();

            //Create a parsed method from the name
            ParsedMethod Method = new ParsedMethod(MethodName);

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
            ParsedClass.addMethod(Method);

        }

    }
}


