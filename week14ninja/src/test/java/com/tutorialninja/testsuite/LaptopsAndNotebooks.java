package com.tutorialninja.testsuite;

import com.google.common.base.Verify;

import com.tutorialninja.pages.*;
import com.tutorialninja.testbase.TestBase;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Text;


public class LaptopsAndNotebooks extends TestBase {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptops = new LaptopsAndNotebooksPage();
    MacBookPage macbook = new MacBookPage();
    ShoppingCart shopping = new ShoppingCart();
    CheckOutPage checkout=new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
//        1.1 Mouse hover on Laptops & Notebooks Tab.and click
//        1.2 Click on “Show All Laptops & Notebooks”
        homePage.clickonlaptopsandnotebooks();


//        1.3 Select Sort By "Price (High > Low)"
        laptops.SelectingPriceHightoLow();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
//    2.1 Mouse hover on Laptops & Notebooks Tab and click
//    2.2 Click on “Show All Laptops & Notebooks”
        homePage.clickonlaptopsandnotebooks();
//    2.3 Select Sort By "Price (High > Low)"
        laptops.SelectingPriceHightoLow();
//    2.4 Select Product “MacBook”
        laptops.clickonmacbook();
//    2.5 Verify the text “MacBook”
        String actualText6 = macbook.verifyTextMacBook();
        String expectedText6 = "MacBook";
        Assert.assertEquals(actualText6, expectedText6);

//    2.6 Click on ‘Add To Cart’ button
        macbook.clickOnAddToCart();
//2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Thread.sleep(1000);
        String actual7 = macbook.verifySuccessMessageForAddingProductToShoppingCart();
        System.out.println(actual7);
        String expected7 = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actual7, expected7);
//    2.8 Click on link “shopping cart” display into success message
        macbook.clickonShoppingCart();
//    2.9 Verify the text "Shopping Cart"
        String actual8 = shopping.verifytext001();
        System.out.println(actual8);
        String expected8 = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actual8, expected8);

//2.10 Verify the Product name "MacBook"
        String actual9 = shopping.verifyTextMacbook();
        System.out.println(actual9);
        String expected9 = "MacBook";
        Assert.assertEquals(actual9, expected9);
//            2.11 Change Quantity "2"
        shopping.changeQuantity();
//            2.12 Click on “Update” Tab
        shopping.UpdateTab();


//2.13 Verify the message “Success: You have modified your shopping cart!”
        String actual10 = shopping.verifymodifiedmessage();
        System.out.println(actual10);
        String expected10 = "Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(actual10, expected10);

//2.14 Verify the Total £737.45
    String actualTotal=shopping.total();
        System.out.println(actualTotal);

String expectedTotal = "$1,204.00";
        Assert.assertEquals(expectedTotal, actualTotal);


//            2.15 Click on “Checkout” button
        shopping.clickOnCheckoutButton();
//2.16 Verify the text “Checkout”
        String actual11=checkout.verifycheckout();
        System.out.println(actual11);
        String expected11="Checkout";
        Assert.assertEquals(expected11, actual11);

//            2.17 Verify the Text “New Customer”
        String actualnewcustomerText=checkout.verifytextnewCustomer();
        String expectednewCustomerText = "New Customer";
        Assert.assertEquals(actualnewcustomerText, expectednewCustomerText);
//            2.18 Click on “Guest Checkout” radio button
        checkout.clickOnGuestCheckout();

//2.19 Click on “Continue” tab
        checkout.clickContinue();
//2.20 Fill the mandatory fields
        checkout.enterMandatoryfields();
//2.21 Click on “Continue” Button
        checkout.clickContinue1();

//2.22 Add Comments About your order into text area
        checkout.addcomments();
//2.23 Check the Terms & Conditions check box
        checkout.setTermsAndConditions();
//2.24 Click on “Continue” button
        Thread.sleep(1000);
        checkout.clickContinue001();

}}