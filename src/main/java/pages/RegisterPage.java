package pages;

import base.BasePage;
import elements.RegisterElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.ActionCommon;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static void inputInfoRegister(String name, String email){
        ActionCommon.enterText(RegisterElements.NAME_INPUT, name);
        ActionCommon.enterText(RegisterElements.EMAIL_INPUT, email);
        ActionCommon.getText()
    }

    public static void clickButtonRegister(){
        ActionCommon.clickElement(RegisterElements.SINGUP_BUTTON);
    }


}
