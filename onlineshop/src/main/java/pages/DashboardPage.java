package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By flagElement = By.linkText("Log out");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(flagElement).getText();
    }
}
