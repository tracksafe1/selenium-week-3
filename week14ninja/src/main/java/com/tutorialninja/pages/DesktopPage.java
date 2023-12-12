package com.tutorialninja.pages;


import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    //1.3 Verify the text ‘Desktops’
   By desktoptext=By.xpath("//*[@id=\"content\"]/h2");

   public String verifyTextDesktop(){
      return getTextFromElement(desktoptext);


   }

//1.3 Select Sort By position "Name: Z to A"
    By sortorder=By.xpath("//select[@id=\"input-sort\"]");
    public void SelectingZtoAFromDropDown() {
        selectByIndexFromDropDown(sortorder,2);
    }
    public void SelectingAtoZFromDropDown() {
        selectByIndexFromDropDown(sortorder,1);
    }

    //1.4 Verify the desktopProduct will arrange in Descending order.
    By descendingorder=By.xpath("//div[@id=\"content\"]/div[4]/div");

    // Extract product names and store them in a list
    public void descendingorderofdesktops(){
        List<WebElement> productElements = driver.findElements(descendingorder);
        List<String> productNames = new ArrayList<>();
        for (WebElement productElement : productElements) {
            productNames.add(productElement.getText());
        }
        // Check if product names are in alphabetical order
        boolean isAlphabeticalOrder = true;
        for (int i = 1; i < productNames.size(); i++) {
            if (productNames.get(i - 1).compareToIgnoreCase(productNames.get(i)) > 0) {
                isAlphabeticalOrder = false;
                break;
            }
        }

        if (isAlphabeticalOrder) {
            System.out.println("Products are arranged in alphabetical order A-Z. ");
        } else {
            System.out.println("Products are arranged in alphabetical order Z-A.");
        }}
//    }}
//2.3 Select Sort By position "Name: A to Z"

//        2.4 Select product “HP LP3065”
       By product=By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a");
    public void clickOnHPLP3065Product(){
    clickOnElement(product);}
}

