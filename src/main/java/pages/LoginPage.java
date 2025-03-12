package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement input_LoginByName(String name) {
        return driver.findElement(By.xpath(String.format("//form[@action='/login']//input[@name='%s']", name)));
    }

    public void login(String email, String password) {
        enterText(input_LoginByName("email"), email);
        enterText(input_LoginByName("password"), password);
        click(button_ByText("Login"));
    }



}
