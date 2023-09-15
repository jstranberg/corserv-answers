package test.java.auto;

import auto.PageObjects.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CorservTest extends TestBaseClass{

    @Test
    public void TC0001_SmokeTest() {
        GuiHelper.launchBrowser();
        Navigation.navToWebPageUnderTest();
        DiscoverHomePage.ClickCreditCardIcon();
        CreditCardsPage.ClickApplyToSecureCardButton();
        CreditCardApplicationPage.ClickSkipStepLink();
        SecuredCardPreApplicationPage.ValidateCashAPR(testAssert);
        GuiHelper.closeWebBrowser();
    }

  }