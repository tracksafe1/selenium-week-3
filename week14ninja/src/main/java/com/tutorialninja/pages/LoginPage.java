package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    //4.3 enter email adress
    By email1=By.id("input-email");
    public void enterEmail(){
        sendTextToElement(email1,"kar19@gmail.com");
    }
    By password= By.id("input-password");
    public void enterPassword(){
        sendTextToElement(password, "123456");
    }
    //4.6 Click on Login button

    By clickOnLogin = By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
    public void loginButton(){
        clickOnElement(clickOnLogin);
}}

