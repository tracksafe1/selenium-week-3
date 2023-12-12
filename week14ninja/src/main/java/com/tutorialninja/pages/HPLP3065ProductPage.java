package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class HPLP3065ProductPage extends Utility {

By producttext=By.xpath("//div[@id='content']/div/div[2]/h1");
    //        2.5 Verify the Text "HP LP3065"
    public String verifyTextOFHPLP3065() {
        return getTextFromElement(producttext);
    }
//        2.6 Select Delivery Date "2022-11-30"
    By date=By.id("input-option225");
    public void delieverydate(){
        clearTextField(date);
        sendTextToElement(date,"2022-11-30");
    }

//        2.7.Enter Qty "1” using Select class.
        By quantity=By.id("input-quantity");
    public void selectQuantity(){
        clearTextField(quantity);
        sendTextToElement(quantity,"1");
    }
    //2.8 Click on “Add to Cart” button
By addtoCart=By.id("button-cart");
    public void clickAddToCart(){
        clickOnElement(addtoCart);
    }
    By verifymessage1=By.xpath(" //div[@class=\"alert alert-success alert-dismissible\"]");
    public String verifyMessage1(){
        return getTextFromElement(verifymessage1);
    }
//    2.10 Click on link “shopping cart” display into success message
    By shoppingCartLink = By.xpath("//ul[@class='list-inline']/li[4]/a");
    public void clickOnShoppingCartLinkIntoSuccessMessage() {
        clickOnElement(shoppingCartLink);
}}
