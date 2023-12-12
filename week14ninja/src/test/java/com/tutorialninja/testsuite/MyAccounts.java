package com.tutorialninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LoginPage;
import com.tutorialninja.pages.MyAccountsPage;
import com.tutorialninja.pages.RegisterPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccounts extends TestBase {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    MyAccountsPage myAccountsPage=new MyAccountsPage();
    LoginPage loginPage=new LoginPage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
//        1.1 Clickr on My Account Link.
//        1.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Register”

        homePage.clickOnAccount();
        myAccountsPage.setRegister();
    //    1.3 Verify the text “Register Account”.
        String actual=registerPage.verifyingReturningCustomer();
        System.out.println(actual);
        String expected="Register Account";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
//        2.1 Clickr on My Account Link.
        homePage.clickOnAccount();
//        2.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Login”
        myAccountsPage.setLogin();
//        2.3 Verify the text “Returning Customer”.

    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
//        3.1 Clickr on My Account Link.
        homePage.clickOnAccount();
//        3.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Register”
        myAccountsPage.setRegister();
        //filling registeration form 3.3-3.8
        registerPage.registerDetails();
      //  3.9 Select Subscribe Yes radio button
        registerPage.clickOnRadioButton();
      //  3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicy();
      //  3.11 Click on Continue button
        registerPage.clickOnContinueButton();

//        3.12 Verify the message “Your Account Has Been Created!”

        Thread.sleep(1000);
        String actualText17= myAccountsPage.verifyAccountRegisteredMessage();
        System.out.println(actualText17);
//        String expectedResult17 = "Your Account Has Been Created!";
//        Assert.assertEquals(actualText17, expectedResult17);

//    3.13 Click on Continue button
        myAccountsPage.clickOnContinueButton();
//    3.14 Click on My Account Link.
        homePage.clickOnAccount();

//    3.15 Call the method “selectMyAccountOptions” method and pass the parameter Logout
        myAccountsPage.setLogout();

//    3.16 Verify the text “Account Logout”
//    3.17 Click on Continue button
        myAccountsPage.clickOnContinue1();
    }
    @Test
public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
//        4.1 Clickr on My Account Link.
        homePage.clickOnAccount();
//        4.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Login”
        myAccountsPage.setLogin();
//        4.3 Enter Email address
      loginPage.enterEmail();
//        4.5 Enter Password
        loginPage.enterPassword();
//        4.6 Click on Login button
        loginPage.loginButton();
      //  4.8 Click on My Account Link.
                homePage.clickOnAccount();
     //   4.9 Call the method “selectMyAccountOptions” method and pass the parameter logout
        myAccountsPage.setLogout();
     //   4.11 Click on Continue button
        myAccountsPage.clickOnContinue1();
    }


    }

