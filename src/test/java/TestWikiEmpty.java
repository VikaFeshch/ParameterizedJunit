import config.BaseClass;
import data.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestWikiEmpty extends BaseClass {
    Language language;

    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(Language.values());
    }

    public TestWikiEmpty(Language language) {
        this.language = language;
        if (!driver.getCurrentUrl().contains("https://"+language.getLang()+".wikipedia.org")) {
            driver.get("https://" + language.getLang() + ".wikipedia.org");

        }
    }
    @Test
    public void test(){
        System.out.println(driver.getTitle());
    }
}
