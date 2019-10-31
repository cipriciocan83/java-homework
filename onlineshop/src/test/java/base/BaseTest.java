package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Homepage;

public class BaseTest {
    private WebDriver driver;
    protected Homepage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://shop.demoqa.com/");
        homepage = new Homepage(driver);

    }
@AfterClass
    public void quitTest(){
        driver.quit();
    }

   /*
        public static void main(String[] args) {
        BaseTest test = new BaseTest();
       test.setUp();
       test.homepage.clickMyAccountButton();
       test.quitTest();
       }
       */
}
