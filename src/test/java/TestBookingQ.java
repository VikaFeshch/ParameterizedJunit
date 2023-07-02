import data.BuferBookingQ;
import data.LinkToBooking;
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
public class TestBookingQ extends BuferBookingQ {
    LinkToBooking linkToBooking;
    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(LinkToBooking.values());

    }

    public TestBookingQ(LinkToBooking linkToBooking) {
        this.linkToBooking = linkToBooking;
        linkBuf=linkToBooking.getLink();
        if (!driver.getCurrentUrl().contains(linkBuf)) {
            resourceBundleQ = ResourceBundle.getBundle(linkToBooking.getS());
            bookingPageQ= PageFactory.initElements(driver, BookingPage.class);
            driver.get(linkToBooking.getLink());
            linkBuf=linkToBooking.getLink();
        }
    }

    @Test
    public void testBut1(){
        Assert.assertEquals(resourceBundleQ.getString("but1"), bookingPageQ.but1Text());
    }
    @Test
    public void testBut2(){
        Assert.assertEquals(resourceBundleQ.getString("but2"), bookingPageQ.but2Text());
    }
    @Test
    public void testBut3(){
        Assert.assertEquals(resourceBundleQ.getString("but3"), bookingPageQ.but3Text());
    }
    @Test
    public void testBut4(){
        Assert.assertEquals(resourceBundleQ.getString("but4"), bookingPageQ.but4Text());
    }
    @Test
    public void testBut5(){
        Assert.assertEquals(resourceBundleQ.getString("but5"), bookingPageQ.but5Text());
    }
}
