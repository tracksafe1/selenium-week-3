package com.tutorialninja.pages;

import com.google.common.base.Verify;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
//2.16 Verify the text “Checkout”
    By checkouttext= By.xpath("//div[@id='content']/h1");
    public String verifycheckout(){
        return getTextFromElement(checkouttext);

    }

//  2.17 Verify the Text “New Customer”
    By textnewcustomer=By.xpath("//div[@id='content']/div[1]/div[1]/div[2]/div/div/div[1]/h2");
    public String verifytextnewCustomer(){
        return getTextFromElement(textnewcustomer);
    }
//            2.18 Click on “Guest Checkout” radio button
    By guestCheckoutButton=By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label/input");
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckoutButton);
    }
//2.19 Click on “Continue” tab
    By continueTab=By.xpath("//input[@id='button-account']");
    public void clickContinue(){
        clickOnElement(continueTab);
    }
//2.20 Fill the mandatory fields
By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By emailAddress = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By addressField = By.id("input-payment-address-1");
    By cityName = By.id("input-payment-city");
    By zipCode = By.name("postcode");
    By countryName = By.id("input-payment-country");
    By zoneName = By.id("input-payment-zone");
    public void enterMandatoryfields() throws InterruptedException {
        sendTextToElement(firstName, "Karishma");
        sendTextToElement(lastName, "Kapur");
        sendTextToElement(emailAddress, "kar21@gmail.com");
        sendTextToElement(telephone, "123456789");
        sendTextToElement(addressField, "BarhamAvenue");
        sendTextToElement(cityName, "London");
        sendTextToElement(zipCode, "Wd63vy");
        Thread.sleep(1000);
        selectByIndexFromDropDown(countryName, 15);
        Thread.sleep(1000);
        selectByIndexFromDropDown(zoneName, 7);
    }

    // 2.21click on continue
    By continue1=By.xpath("//input[@id=\"button-guest\"]");
    public void clickContinue1(){
        clickOnElement(continue1);}

//2.22 Add Comments About your order into text area
        By comments=By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea");
        public void addcomments(){
            sendTextToElement(comments,"please write Fragile");
        }
//2.23 Check the Terms & Conditions check box
 By termsAndConditions=By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]");
        public void setTermsAndConditions(){
            clickOnElement(termsAndConditions);}

//2.24 Click on “Continue” button
By continue001=By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]");
public void clickContinue001(){
    clickOnElement(continue001);
            }


    }













