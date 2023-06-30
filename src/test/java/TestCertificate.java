import config.BaseClass;
import data.DataProvider;
import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCertificate extends BaseClass {
    String number;
    CertificatePage certificatePage;

    @Parameterized.Parameters
    public static Collection options(){

        return DataProvider.getNotValidCert();
    }


    public TestCertificate(String number) {
        this.number = number;
        driver.get("https://certificate.ithillel.ua/");
        certificatePage = PageFactory.initElements(driver,CertificatePage.class);
    }
    @Test
    public void testCert1() throws Exception {
        certificatePage.inputNumCert(number);
        certificatePage.clButCheck();
        Assert.assertFalse(certificatePage.checkcertifChekForm());
    }
}
