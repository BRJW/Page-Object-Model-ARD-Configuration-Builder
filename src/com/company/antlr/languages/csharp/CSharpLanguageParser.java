package com.company.antlr.languages.csharp;

import com.company.ConfigObject;
import com.company.LanguageParser;
import com.company.SupportedLanguages;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;


public class CSharpLanguageParser extends LanguageParser {

    public CSharpLanguageParser(SupportedLanguages lang) {
        super(lang);
    }

    public List<ConfigObject> Parse(String FileContents) {

/*        CompilationUnit cu;
        cu = JavaParser.parse(FileContents);
        List<ConfigObject> configObjects = new ArrayList<>();
        cu.accept(new CSharpLanguageParser.ClassVisitor(), configObjects);
        return configObjects;*/
        return null;
    }

    public List<ConfigObject> Parse2(String FileContents) {
        try {
            ANTLRFileStream input = new ANTLRFileStream("C:\\Users\\johbe07\\Desktop\\CSharpPageFunctions\\Class.cs"); // a character stream
            CSharpLexer lex = new CSharpLexer(input); // transforms characters into tokens
            CommonTokenStream tokens = new CommonTokenStream(lex); // a token stream
            CSharpParser parser = new CSharpParser(tokens); // transforms tokens into parse trees
            ParseTree t = parser.class_definition(); // creates the parse tree from the called rule
            //t.accept()
        }
        catch (Exception e) {}
        return null;
    }
}