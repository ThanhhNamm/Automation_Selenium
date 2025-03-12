package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.WebDriverManager;

public class BaseTest {
    protected WebDriver driver;
    BasePage basePage = new BasePage(driver);

    @BeforeMethod
    public void setup() {
        driver = WebDriverManager.getDriver();
    }

    protected void verifyElementToBeVisible(WebElement element) {
        basePage.waitForElementToBeVisible(element);
        Assert.assertTrue(element.isDisplayed(),"Element NOT visible!");
    }
}
