package com.company;

import java.util.List;

abstract public class LanguageParser {

    private SupportedLanguages language;

    public SupportedLanguages getLanguage() {
        return language;
    }

    public String getLanguageStr(){
        return language.getLanguage();
    }

    protected LanguageParser(SupportedLanguages lang){
        language = lang;
    }

    abstract public List<ConfigObject> Parse(String FileContents);
}
