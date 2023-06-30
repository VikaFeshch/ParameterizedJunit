package data;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    static List<String> names = new ArrayList<>();
    public static List<String> getValidNames(){
        names.clear();
        names.add("Vika");
        names.add("Vero");
        return names;
    }
    public static List<String> getNotValidNames(){
        names.clear();
        names.add("Vlfkgig a");
        names.add("Vielk dg");
        return names;
    }
    public static List<String> getNotValidCert(){
        names.clear();
        names.add("Vlfkgig a");
        names.add("Vielk dg");
        return names;
    }
}
