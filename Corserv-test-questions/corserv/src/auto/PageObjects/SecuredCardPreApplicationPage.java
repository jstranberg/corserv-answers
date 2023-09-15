package auto.PageObjects;

import auto.SeleniumExtensions.WebDriverExtensions;
import auto.TestHelper.LoggingLibrary;
import auto.TestHelper.TestAssert;

public class SecuredCardPreApplicationPage extends WebDriverExtensions {

  private final static String cashAPR = "#terms-scrollbox > div > div > div:nth-child(4) > div > p:nth-child(1) > b";

  public static void ValidateCashAPR(TestAssert testAssert){
      String cashAPRRate = getElementBySelector(cashAPR).getText();
      float f = Float.parseFloat(cashAPRRate);
      testAssert.setPass(LoggingLibrary.CompareRate(f, (float) 20.0));
  }
}