package auto.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import auto.SeleniumExtensions.WebDriverBase;
// import auto.TestHelper.ConfigSettings;

public class Navigation extends WebDriverBase{

    public static void navToWebPageUnderTest(){
        driver=new ChromeDriver();
        driver.get("https://www.discover.com/");
    }
}
