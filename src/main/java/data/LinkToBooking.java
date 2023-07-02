package data;

public enum LinkToBooking {
    EN("en_bq","https://www.booking.com/index.en-gb.html"),
    FR("fr_bq","https://www.booking.com/index.fr.html"),
    DE("de_bq","https://www.booking.com/index.de.html");

    String link;
    String s;

    LinkToBooking(String s, String link) {
        this.s=s;
        this.link = link;
        }

    public String getS() {
        return s;
    }

    public String getLink() {
        return link;
    }
}
