package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;


    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String path){
        driver.findElement(By.xpath(path)).click();
    }

    public MyAccountPage clickMyAccountButton(){
        clickLink("//a[@class='woocommerce-store-notice__dismiss-link']");
        clickLink("//a[contains(text(),'My Account')]");
        return new MyAccountPage(driver);
    }
}
