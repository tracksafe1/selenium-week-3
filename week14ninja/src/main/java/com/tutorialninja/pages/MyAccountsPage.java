package com.tutorialninja.pages;

import com.google.common.base.Verify;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {
    By login = By.linkText("Login");
    By register = By.linkText("Register");
    By logout = By.linkText("Logout");


    public void setLogin(){
        clickOnElement(login);
    }
    public void setRegister(){
        clickOnElement(register);
    }
    public void setLogout(){
        clickOnElement(logout);
    }
    //    3.12 Verify the message “Your Account Has Been Created!”
    By verifyAccountRegister = By.xpath("//div[@id=\"content\"]/h1");
    public String verifyAccountRegisteredMessage(){
        return getTextFromElement(verifyAccountRegister);
    }
    //    3.13 Click on Continue button
    By clickOnContinue = By.xpath("//div[@id=\"content\"]/div/div/a");
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinue);
    }
    //    3.17 Click on Continue button
    By click = By.xpath("//div[@class='pull-right']/a");
    public void clickOnContinue1(){
        clickOnElement(click);
    }

    }
