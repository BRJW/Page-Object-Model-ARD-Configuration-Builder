package com.company;

public class LanguageParserFactory {
    public static LanguageParser getLanguageParser(SupportedLanguages lang){
        switch (lang){
            case JAVA:
                return new JavaLanguageParser(lang);

            default: return null;
        }
    }

}
