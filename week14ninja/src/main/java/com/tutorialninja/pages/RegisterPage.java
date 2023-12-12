package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
//2.3 Verify the text “Returning Customer”.
 By returningtext=By.xpath("//*[@id=\"content\"]/h1");
 public String verifyingReturningCustomer(){
     return getTextFromElement(returningtext);
 }
    By firstname=By.xpath("//fieldset[@id='account']/div[2]/div[1]/input");
    By lastname = By.id("input-lastname");
    By Email= By.id("input-email");
    By telephone=By.id("input-telephone");
    By password= By.id("input-password");
    By confirmPassword=By.id("input-confirm");
    public void registerDetails() {
        sendTextToElement(firstname, "karishma");
        sendTextToElement(lastname, "Kapur1322");
        sendTextToElement(Email, "kar19@gmail.com");
        sendTextToElement(telephone, "123456789");
        sendTextToElement(password, "123456");
        sendTextToElement(confirmPassword, "123456");
    }
//  3.9 Select Subscribe Yes radio button
By clickOnRadio = By.xpath("//div[@id='content']/form/fieldset[3]/div/div/label[1]/input");
    public void clickOnRadioButton(){
        clickOnElement(clickOnRadio);
    }
//3.10 Click on Privacy Policy check box
By clickOnPrivacy = By.xpath("//div[@class='buttons']/div/input[1]");
    public void clickOnPrivacyPolicy(){
        clickOnElement(clickOnPrivacy);
    }
//3.11 Click on Continue button
By clickOnContinue = By.xpath("//div[@class='buttons']/div/input[2]");
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinue);
    }
}
