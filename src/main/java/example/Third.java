package example;

import data.DataProvider;
import data.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Third {
    Language language;

    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(Language.values());
    }

    public Third(Language language) {
        this.language = language;
    }
    @Test
    public void test(){
        System.out.println(language.getLang());
    }
}
