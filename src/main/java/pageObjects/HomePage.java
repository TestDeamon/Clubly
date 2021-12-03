package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By LoginBtn = By.xpath("//*[@id=\"app\"]/div/div/div/button");
//    private By JoinAssociation = By.xpath("//*[@id=\"app\"]/div/div/div/span");


    public void clickLoginBtn() throws InterruptedException {
        Thread.sleep (10000);
        driver.findElement(LoginBtn).click();
    }
}
