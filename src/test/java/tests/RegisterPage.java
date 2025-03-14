package tests;

import base.BasePage;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.LoginPage;

public class RegisterPage extends BaseTest {
    @Test
    public void testcaseRegister() {
        LoginPage loginPage = new LoginPage(driver);
        Homepage homepage = new Homepage(driver);
        BasePage basePage = new BasePage(driver);
        homepage.navigateToPage("Signup / Login");
        loginPage.login("test@cypress.vn", "testpass");
        verifyElementToBeVisible(basePage.a_ByText("Logout"));
    }
}
