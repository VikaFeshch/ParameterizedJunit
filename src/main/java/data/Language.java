package data;

public enum Language {
    EN("en"),
    UA("uk"),
  //  ES("es"),
 //   DE("de");
    FR("fr");
    String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
