package com.tutorialninja.testsuite;

import com.tutorialninja.pages.ComponentsPage;
import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TopMenuTest extends TestBase {
    HomePage homepage = new HomePage();
    DesktopPage deskTopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsandNotebooks = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage= new ComponentsPage();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homepage.clickOnDesktopclick();
        // 1.3 Verify the text ‘Desktops’
        String actualResult = deskTopPage.verifyTextDesktop();
        String expectedTesult = "Desktops";
        Assert.assertEquals(actualResult,expectedTesult);

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homepage.clickonlaptopsandnotebooks();
       String actual1= laptopsandNotebooks.laptopsAndNotebookstext();
       String expected1="Laptops & Notebooks";
       Assert.assertEquals(actual1,expected1);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homepage.clickOnCoponents();
       String actual2= componentsPage.verifyComponentsText();
       String expected2="Components";
       Assert.assertEquals(actual2,expected2);
    }

}
