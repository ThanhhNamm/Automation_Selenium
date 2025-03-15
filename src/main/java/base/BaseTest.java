package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.WebDriverManager;

public class BaseTest {
        protected static WebDriver driver;

        @BeforeTest
        public static void setUp() {
            driver = DriverManager.getInstance("chrome").getDriver();
//            driver.get("https://automationexercise.com/");
        }

        @BeforeTest
        public static void tearDown() {
            DriverManager.getInstance("chrome").quitDriver();
        }
}
