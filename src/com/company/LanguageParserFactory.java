package com.company;

import com.company.antlr.languages.csharp.ListenerOrientedParser;

public class LanguageParserFactory {
    public static LanguageParser getLanguageParser(SupportedLanguages lang){
        switch (lang){
            case JAVA:
                return new JavaLanguageParser(lang);
            case CSHARP:
                return new ListenerOrientedParser(lang);
            default: return null;
        }
    }

}
