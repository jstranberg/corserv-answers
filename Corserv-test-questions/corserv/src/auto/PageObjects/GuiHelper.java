package auto.PageObjects;

import auto.SeleniumExtensions.WebDriverBase;
// import auto.TestHelper.ConfigSettings;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// import static auto.SeleniumExtensions.WebDriverBase.getWebDriver;

public class GuiHelper {

   WebDriver driver;

    public static void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Applications/chromedriver_mac64/chromedriver");
    }

    public static void closeWebBrowser(){
        WebDriverBase.driver.close();
        WebDriverBase.driver.quit();
    }
}