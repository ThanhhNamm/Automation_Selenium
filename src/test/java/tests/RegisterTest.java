package tests;
import base.BaseTest;
import data.RegisterData;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {
    @Test
    public void testcaseRegister() {
        RegisterPage registerPage = new RegisterPage();
        Homepage homepage = new Homepage();
        homepage.navigateHomePage();
        homepage.navigateToLoginPage();
        registerPage.inputInfoRegister(RegisterData.USERNAME, RegisterData.EMAIL);
        registerPage.submitInfoRegister();
    }
}
