package data;

public enum LangOnBooking {
    EN("en_b"),
    DE("de_b"),
    FR("fr_b");

    String str;

    LangOnBooking(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
