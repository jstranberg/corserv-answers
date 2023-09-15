package auto.SeleniumExtensions;

// import auto.TestHelper.IoLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBase {

    public static WebDriver driver;

    public static void getWebDriver(String browser) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-extensions");
            options.addArguments("disable-infobars");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
    }

    public static void getWebDriver (WebDriver chrome){
        driver = chrome;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
}
