package com.company;

public enum SupportedLanguages {

    JAVA ("Java", new String[]{"java"}), CSHARP ("CSharp", new String[]{"cs"});


    private final String language;
    private final String[] extension;

    public String getLanguage() {
        return language;
    }

    public String[] getExtension() {
        return extension;
    }

    SupportedLanguages(String language, String[] extension) {
        this.language = language;
        this.extension = extension;
    }


    public static String getSupoortedLanguagesStr(){

        String languages = new String();

        for (SupportedLanguages lang :SupportedLanguages.values()){
            languages += lang.language;
            languages += ", ";
        }
        languages = languages.substring(0, languages.length() - 2);


        return languages;
    }

    public static  SupportedLanguages getSupportedLanguage(String lang) throws Exception {
        for (SupportedLanguages c : SupportedLanguages.values()) {
            if (c.language.equals(lang)) {
                return c;
            }
        }
        throw new Exception("Language not found. Supported Languages are: " + getSupoortedLanguagesStr());
    }

    public static boolean contains(String test) {

        for (SupportedLanguages c : SupportedLanguages.values()) {
            if (c.language.equals(test)) {
                return true;
            }
        }

        return false;
    }
}
