package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BasePage {
    public Homepage(WebDriver driver) {
        super(driver);
    }

    public void navigateToPage(String page) {
        click(a_ByText(page));
    }

}
