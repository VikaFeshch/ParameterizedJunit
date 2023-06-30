package example;

import java.util.Iterator;
import java.util.ResourceBundle;

public class ResourceEx {
    public static void main(String[] args) {
        ResourceBundle resourceBundle=ResourceBundle.getBundle("vika");
        Iterator<String> iterator = resourceBundle.getKeys().asIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(resourceBundle.getString("tel"));
    }
}
