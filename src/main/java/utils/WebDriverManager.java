package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverManager {
    private static WebDriver driver;
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = properties.getProperty("BROWSER").toUpperCase();
            switch (browser) {
                case "CHROME":
                    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;

                case "EDGE":
                    System.setProperty("webdriver.edge.driver", "");
                    driver = new EdgeDriver();
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Browser!");
            }

            driver.manage().window().maximize();
            driver.get(properties.getProperty("BASE_URL"));
        }

        return driver;
    }
}
