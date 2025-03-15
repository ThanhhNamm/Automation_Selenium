package pages;

import base.BasePage;
import data.RegisterData;
import elements.RegisterElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.ActionCommon;

public class RegisterPage extends BasePage {
    public void inputInfoRegister(String name, String email){
        actions.enterText(RegisterElements.EMAIL_INPUT, email);
        actions.enterText(RegisterElements.NAME_INPUT, name);
    }

    public void submitInfoRegister(){
        actions.clickElement(RegisterElements.SINGUP_BUTTON);
    }
}
