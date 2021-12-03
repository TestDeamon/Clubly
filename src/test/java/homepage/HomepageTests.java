package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import setup.SetupTests;


public class HomepageTests extends SetupTests {
    private WebDriver driver;

    public void HomepageTests(WebDriver driver){
        this.driver = driver;
    }
//    private By CreateAssociation = By.xpath("//*[@id=\"homepage\"]/div[1]/div/div/button");

    @Test
    public void clickLogin() throws InterruptedException{
        homePage.clickLoginBtn ();
//        LoginPage loginPage = loginPage.clickLoginBtn();
    }

//    public LoginPage clickCreateAssociationBtn() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(CreateAssociation).click();
//        return new LoginPage (driver);
//    }
//    public LoginPage clickJoinAssociationBtn() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(JoinAssociation).click();
//        return new LoginPage(driver);
//    }
}
