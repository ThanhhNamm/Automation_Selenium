package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//form[@action='/login']//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//form[@action='/login']//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        enterText(emailField, email);
        enterText(passwordField, password);
        click(loginBtn);
    }
}
