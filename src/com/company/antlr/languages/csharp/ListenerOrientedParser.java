package com.company.antlr.languages.csharp;

import com.company.ConfigObject;
import com.company.LanguageParser;
import com.company.SupportedLanguages;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public class ListenerOrientedParser extends LanguageParser{

    public ListenerOrientedParser(SupportedLanguages lang){
        super(lang);
    }

    public List<ConfigObject> Parse(String code) {
        CharStream charStream = new ANTLRInputStream(code);
        CSharpLexer lexer = new CSharpLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        CSharpParser parser = new CSharpParser(tokens);

        ClassListener classListener = new ClassListener();
        ParseTree tree = parser.compilation_unit();
        ParseTreeWalker.DEFAULT.walk(classListener, tree);

        List<ConfigObject> parsedClasses = new ArrayList<>();

        for(String className : classListener.getListNames()){
            System.out.println(className);
            ConfigObject parsedClass = new ConfigObject(className);
            parsedClasses.add(parsedClass);
        }

        return  parsedClasses;

    }


    class  MethodListener extends CSharpParserBaseListener {

        public MethodListener(){}

        @Override
        public void enterMethod_declaration(CSharpParser.Method_declarationContext ctx)
        {
            System.out.println("Method: " + ctx.method_member_name().identifier().toString());
            System.out.println("Method: " + ctx.method_member_name().getText());
        }
    }


    class ClassListener extends CSharpParserBaseListener {

        private ConfigObject parsedClass;
        private List<String> Names;

        public ClassListener(){
            Names = new ArrayList<String>();
        }
        @Override
        public void exitClass_definition(CSharpParser.Class_definitionContext ctx){
            System.out.println(";;;;;;");
        }

        @Override
        public void enterClass_definition(CSharpParser.Class_definitionContext ctx) {

            String name = ctx.identifier().getText();
            System.out.println("access: " + ctx.parent.getRuleContext().getText());
            System.out.println("access2: " + ctx.parent.getText());
            Names.add(name);
            System.out.println("class: " + name);

            ParseTree tree = ctx;

            MethodListener methlist = new MethodListener();
            ParseTreeWalker.DEFAULT.walk(methlist, tree);

            ctx.enterRule(methlist);


            //TODO: add methods..
        }

        public ConfigObject getParsedClass() {
            return parsedClass;
        }

        public List<String> getListNames(){
            return Names;
        }

    }

}