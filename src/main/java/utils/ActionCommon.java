package utils;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionCommon extends BasePage{

    public ActionCommon(WebDriver driver) {
        super(driver);
    }
    private static WebDriver driver;

    public static void clickElement(WebElement element){
        element.isDisplayed();
        element.click();
    }
    public static void clickElement(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        clickElement(element);
    }

    public static void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    } 

    public static void enterText(String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        enterText(element, text);
    }

    public static String getText(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        return element.getText();
    }

    public static String getText(WebElement element){
        return element.getText();
    }


}
