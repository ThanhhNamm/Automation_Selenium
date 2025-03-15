//package tests;
//
//import base.BasePage;
//import base.BaseTest;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.Homepage;
//import pages.LoginPage;
//
//public class LoginTest extends BaseTest {
//    @Test
//    public void testGoToLoginPage() {
//        LoginPage loginPage = new LoginPage(driver);
//        Homepage homepage = new Homepage(driver);
//        BasePage basePage = new BasePage(driver);
//        homepage.navigateToPage("Signup / Login");
//        loginPage.login("test@cypress.vn", "testpass");
//        verifyElementToBeVisible(basePage.a_ByText("Logout"));
//    }
//}
