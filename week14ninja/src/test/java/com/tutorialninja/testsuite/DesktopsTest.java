package com.tutorialninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HPLP3065ProductPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.ShoppingCart;
import com.tutorialninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Model;

import java.util.ArrayList;
import java.util.List;

public class DesktopsTest extends TestBase {
    DesktopPage desktoppage=new DesktopPage();
    HomePage homePage=new HomePage();
    HPLP3065ProductPage pro=new HPLP3065ProductPage();
    ShoppingCart cart=new ShoppingCart();
    @Test
    public void  verifyProductArrangeInAlphaBaticalOrder(){
        homePage.clickOnDesktopclick();
        desktoppage.SelectingZtoAFromDropDown();
        desktoppage.descendingorderofdesktops();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        homePage.clickOnDesktopclick();
        desktoppage.SelectingAtoZFromDropDown();
        desktoppage.clickOnHPLP3065Product();
        String actual3= pro.verifyTextOFHPLP3065();
        String expected3="HP LP3065";
        Assert.assertEquals(actual3,expected3);
        pro.delieverydate();
        pro.selectQuantity();
        pro.clickAddToCart();
      String actual4=pro.verifyMessage1();
        System.out.println(actual4);
     String expected4="Success: You have added HP LP3065 to your shopping cart!\n" +
             "×";
     Assert.assertEquals(actual4,expected4);
     pro.clickOnShoppingCartLinkIntoSuccessMessage();
//        2.11 Verify the text "Shopping Cart"
        String actual5= cart.verifytext001();
        System.out.println(actual5);
        String expected5="Shopping Cart  (1.00kg)";
        Assert.assertEquals(actual5,expected5);


   }}