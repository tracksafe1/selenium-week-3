package com.tutorialninja.pages;

import com.google.common.base.Verify;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;


public class ShoppingCart extends Utility {
//2.11 Verify the text "Shopping Cart"
  By text001=  By.xpath("//div[@id='checkout-cart']/div[1]/div[1]/h1");
  public String verifytext001() {
      return getTextFromElement(text001);
  }
//2.10 Verify the Product name "MacBook"
    By verifyMacbook=By.xpath("//div[@class='table-responsive']/table[1]/tbody/tr/td[2]/a");
    public String verifyTextMacbook(){
        return getTextFromElement(verifyMacbook);
    }
//            2.11 Change Quantity "2"
By quantity=By.xpath("//div[@class='table-responsive']/table[1]/tbody/tr/td[4]/div[1]/input[1]");
    public void changeQuantity(){
        clearTextField(quantity);
        sendTextToElement(quantity,"2");
    }

    //            2.12 Click on “Update” Tab
By updatetab=By.xpath("//div[@class='input-group btn-block']/span[1]/button[1]");
    public void UpdateTab(){
        clickOnElement(updatetab);}

//2.13 Verify the message “Success:
        By modifiedmessage=By.xpath("//div[@id='checkout-cart']/div[1]");
        public String verifymodifiedmessage(){
            return getTextFromElement(modifiedmessage);
}
//2.14 Verify the Total £737.45
 By total=By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]");
        public String total(){
        return getTextFromElement(total);
        }
   //  2.15 Click on “Checkout” button
    By clickOnCheckout = By.xpath("//div[@id='content']/div[3]/div[2]/a");
    public void clickOnCheckoutButton(){
        clickOnElement(clickOnCheckout);
    }}
