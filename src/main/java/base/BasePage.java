package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ActionCommon;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    protected ActionCommon actions;

    public BasePage() {
        this.driver = DriverManager.getInstance("chrome").getDriver();
        this.actions = new ActionCommon();
    }
}
