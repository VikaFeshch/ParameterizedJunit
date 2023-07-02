import data.BuferBooking;
import data.LangOnBooking;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.BookingPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

import static example.DATA.i;
import static example.DATA.linkBuf;

@RunWith(Parameterized.class)
public class TestBooking extends BuferBooking {
    LangOnBooking langOnBooking;
    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(LangOnBooking.values());

    }

    public TestBooking(LangOnBooking langOnBooking) {
        this.langOnBooking = langOnBooking;
        linkBuf=ResourceBundle.getBundle(langOnBooking.getStr()).getString("link");
        if (!driver.getCurrentUrl().contains(linkBuf)) {
            bookingLangBundle = ResourceBundle.getBundle(langOnBooking.getStr());
            bookingPage= PageFactory.initElements(driver, BookingPage.class);
            driver.get(bookingLangBundle.getString("link"));
            linkBuf=bookingLangBundle.getString("link");
        }
    }

    @Test
    public void testBut1(){
        Assert.assertEquals(bookingLangBundle.getString("but1"), bookingPage.but1Text());
    }
    @Test
    public void testBut2(){
        Assert.assertEquals(bookingLangBundle.getString("but2"), bookingPage.but2Text());
    }
    @Test
    public void testBut3(){
        Assert.assertEquals(bookingLangBundle.getString("but3"), bookingPage.but3Text());
    }
    @Test
    public void testBut4(){
        Assert.assertEquals(bookingLangBundle.getString("but4"), bookingPage.but4Text());
    }
    @Test
    public void testBut5(){
        Assert.assertEquals(bookingLangBundle.getString("but5"), bookingPage.but5Text());
    }
}
