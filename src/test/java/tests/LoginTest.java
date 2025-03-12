package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void testGoToLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@cypress.vn", "testpass");
    }
}
