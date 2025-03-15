package pages;

import base.BasePage;
import elements.HomeElements;
import elements.RegisterElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BasePage {
    public void navigateHomePage(){
        actions.navigateTo("https://automationexercise.com/");
    }
    public void navigateToLoginPage(){
        actions.clickElement(HomeElements.LOGIN_ITEMS);
    }

}
