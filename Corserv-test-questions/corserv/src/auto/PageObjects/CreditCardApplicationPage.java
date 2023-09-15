// url is https://www.discovercard.com/application/website/apply?adpt=mn&srcCde=KXPA

package auto.PageObjects;

import auto.SeleniumExtensions.WebDriverExtensions;

public class CreditCardApplicationPage extends WebDriverExtensions {

  private final static String skipThisStep = "#adaptive-skip-this-step-new";

  public static void ClickSkipStepLink(){
      getElementBySelector(skipThisStep).click();
  }
}
