package com.company.antlr.languages.csharp;

import com.company.ConfigAction;
import com.company.ConfigObject;
import com.company.LanguageParser;
import com.company.SupportedLanguages;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
        parser.class_definition().enterRule(classListener);

        /*CSharpParser.Class_definitionContext cctx = parser.class_definition();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(classListener,cctx);*/

        List<ConfigObject> parsedClasses = new ArrayList<>();

        for(String className : classListener.getListNames()){
            System.out.println(className);
            ConfigObject parsedClass = new ConfigObject(className);
            parsedClasses.add(parsedClass);
        }

        return  parsedClasses;

        // return classListener.getListNames();

        /*.addParseListener(classListener);
        classListener.enterClass_base();*/
    }

    class MethodVisitor extends CSharpParserBaseVisitor {
        public ConfigAction getParsedMethod() {
            return parsedMethod;
        }

        private ConfigAction parsedMethod;
        private List<String> Names;

        @Override
        public Object visitMethod_declaration(CSharpParser.Method_declarationContext ctx){
            String name = ctx.method_member_name().getText();
            System.out.println("Method:" + name);
            Names.add(name);
            return null;
        }

    }

    class ClassListener extends CSharpParserBaseListener {

        private ConfigObject parsedClass;
        private List<String> Names;

        public ClassListener(){
            Names = new ArrayList<String>();
        }

        @Override
        public void enterClass_definition(CSharpParser.Class_definitionContext ctx) {

            String name = ctx.identifier().getText();
            Names.add(name);
            System.out.println("class:" + name);
            for(ParseTree Tree : ctx.children){
                MethodVisitor mthd = new MethodVisitor();
                Tree.accept(mthd);
            }
/*            String className = ctx.enterClass_definition();
            MethodListener methodListener = new MethodListener();
            ctx.method().forEach(method -> method.enterRule(methodListener));
            Collection<Method> methods = methodListener.getMethods();
            parsedClass = new ConfigObject(className);*/
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