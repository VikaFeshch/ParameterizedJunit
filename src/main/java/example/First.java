package example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class First {
    String name;

    @Parameterized.Parameters
    public static Collection options(){
        List<String> list = new ArrayList<String>();
        list.add("Vika");
        list.add("Vero");
        return list;
    }

    public First(String name) {
        this.name = name;
        DATA.i++;
    }

    @Test
    public void test1(){
        System.out.println(name+" "+DATA.i);
    }

    @Test
    public void test2(){
        System.out.println(name+" "+DATA.i);
    }


}
