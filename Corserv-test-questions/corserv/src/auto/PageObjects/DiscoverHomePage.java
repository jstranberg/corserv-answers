package auto.PageObjects;

import auto.SeleniumExtensions.WebDriverExtensions;

public class DiscoverHomePage extends WebDriverExtensions {

    private final static String creditCardsIcon = "#main-content-rwd > div > div > div.midnav.aem-GridColumn.aem-GridColumn--default--12 > div.domain-carousel > div.secondary-nav-bar.carousel__track-container > ul > li.carousel__slide.current-slide > a > div > div";

    public static void ClickCreditCardIcon(){
        getElementBySelector(creditCardsIcon).click();
    }
}