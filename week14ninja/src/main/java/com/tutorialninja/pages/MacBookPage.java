package com.tutorialninja.pages;

import com.google.common.base.Verify;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility{
    By productMacbook=  By.xpath("//div[@id='product-product']/div/div/div/div[2]/h1");
    //            2.5 Verify the text “MacBook”
    public String verifyTextMacBook(){
        return getTextFromElement(productMacbook);
    }
    //            2.6 Click on ‘Add To Cart’ button
    By addtocartbutton=By.xpath("//div[@id='product-product']/div/div/div[1]/div[2]/div[2]/div/button");
//    2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    By successMessageForAddingProduct = By.xpath("//div[@id='product-product']/div[1]");

    public String verifySuccessMessageForAddingProductToShoppingCart() {
        return getTextFromElement(successMessageForAddingProduct);
    }
public void clickOnAddToCart(){
    clickOnElement(addtocartbutton);}

//            2.8 Click on link “shopping cart” display into success message
    By shoppingCartclick=By.linkText("shopping cart");
    public void clickonShoppingCart(){
        clickOnElement(shoppingCartclick);
    }
}


