package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By userEmail = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/input[1]");
    private By pwd = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/input[2]");

    public void enterEmail(String emailFiller){
        driver.findElement(userEmail).sendKeys(emailFiller);
    }

    public void enterPassword(String pwdFiller){
        driver.findElement(pwd).sendKeys(pwdFiller);
    }

    public void clickLoginBtn(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[5]/button")).click();
//        return new LandingPage;
    }
}
