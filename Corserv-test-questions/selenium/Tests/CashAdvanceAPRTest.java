import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DiscoverHomePage.java;
import CreditCardsPage.java;
import SecuredCardPreApplicationPage.java;
import CreditCardsApplicationPage.java


public class Main {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/John/Downloads/chromedriver_mac_arm64/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://www.discover.com/");
    }
    public static void main(String[] args) {

        Main obj=new Main();
        obj.launchBrowser();
    }
}