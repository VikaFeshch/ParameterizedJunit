package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage {
    @FindBy(id="accommodations")
    WebElement but1;
    @FindBy(id="flights")
    WebElement but2;
    @FindBy(id="cars")
    WebElement but3;
    @FindBy(id="attractions")
    WebElement but4;
    @FindBy(id="airport_taxis")
    WebElement but5;

    public String but1Text(){

        return but1.findElement(By.tagName("div")).getText();
    }
    public String but2Text(){
        return but2.findElement(By.tagName("div")).getText();
    }
    public String but3Text(){
        return but3.findElement(By.tagName("div")).getText();
    }
    public String but4Text(){
        return but4.findElement(By.tagName("div")).getText();
    }
    public String but5Text(){
        return but5.findElement(By.tagName("div")).getText();
    }
}
