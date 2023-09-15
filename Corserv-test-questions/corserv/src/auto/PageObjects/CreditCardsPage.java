package auto.PageObjects;

import auto.SeleniumExtensions.WebDriverExtensions;

public class CreditCardsPage extends WebDriverExtensions {

  private final static String securedCardApplyButton = "#siteframe > div > div.root.responsivegrid > div > div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 > div > div:nth-child(6) > div > div > div.cmp-container.cards-offer-comp.cmp-container__size-3 > div.slider-cchp > div.cmp-container__column.cmp-container__column-3.cmp-container-3 > div:nth-child(2) > div > a";

  public static void ClickApplyToSecureCardButton(){
      getElementBySelector(securedCardApplyButton).click();
  }
}
