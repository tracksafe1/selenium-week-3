package com.tutorialninja.pages;

import com.google.common.base.Verify;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {
  //2.3 Verify the text ‘Laptops & Notebooks’
  By laptopsAndNotebooks=By.tagName("h2");
  public String laptopsAndNotebookstext(){
      return getTextFromElement(laptopsAndNotebooks);

}
//       1.3 Select Sort By "Price (High > Low)"
    By sortorder1=By.xpath("//select[@id=\"input-sort\"]");
    public void SelectingPriceHightoLow() {
        selectByIndexFromDropDown(sortorder1,4);
    }
//    2.4 Select Product “MacBook”
    By productMacbook=By.xpath("//div[@id='content']/div[4]/div[4]/div[1]/div[2]/div[1]/h4/a");
    public void clickonmacbook(){
        clickOnElement(productMacbook);
    }
}
