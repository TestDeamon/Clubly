package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.HomePage;

public class SetupTests {
    //Create a WebDriver Object
    private WebDriver driver;
    //Create LoginPage object
    protected HomePage homePage;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("staging.clubly.io");

        homePage = new HomePage(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
