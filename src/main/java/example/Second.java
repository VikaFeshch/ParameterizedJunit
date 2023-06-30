package example;

import data.DataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class Second {

    String name;

    @Parameterized.Parameters
    public static Collection options(){
        return DataProvider.getValidNames();
    }

    public Second(String name) {
        this.name = name;

    }

    @Test
    public void test1(){
        System.out.println(name);
    }
}
