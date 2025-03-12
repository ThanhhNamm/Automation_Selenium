package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.WebDriverManager;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverManager.getDriver();
    }
}
