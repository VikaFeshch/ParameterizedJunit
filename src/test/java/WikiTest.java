import config.BaseClass;
import data.BuferWiki;
import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.WikiPage;
import static example.DATA.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class WikiTest extends BuferWiki {
    Language language;

    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(Language.values());
    }

    public WikiTest(Language language) {
        this.language = language;
        if (!driver.getCurrentUrl().contains("https://"+language.getLang()+".wikipedia.org")) {
            driver.get("https://" + language.getLang() + ".wikipedia.org");
            System.out.println(i++);
            wikiBundle= ResourceBundle.getBundle(language.getLang());
            wikiPage= PageFactory.initElements(driver, WikiPage.class);
        }
    }
    @Test
    public void testTab1(){
        Assert.assertEquals(wikiBundle.getString("tab1"),wikiPage.tab1Test());
    }
    @Test
    public void testTab2(){
        Assert.assertEquals(wikiBundle.getString("tab2"),wikiPage.tab2Test());

    }
    @Test
    public void testTab3(){
        Assert.assertEquals(wikiBundle.getString("tab3"),wikiPage.tab3Test());
    }
}

