package utils;

import base.BasePage;
import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class ActionCommon {

    private WebDriver driver;
    private WebDriverWait wait;

    public ActionCommon() {
        this.driver = DriverManager.getInstance("chrome").getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void clickElement(WebElement element){
        element.isDisplayed();
        element.click();
    }
    public void clickElement(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        clickElement(element);
    }

    public static void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    } 

    public void enterText(String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        enterText(element, text);
    }

    public  String getText(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        return element.getText();
    }

    public static String getText(WebElement element){
        return element.getText();
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

}
