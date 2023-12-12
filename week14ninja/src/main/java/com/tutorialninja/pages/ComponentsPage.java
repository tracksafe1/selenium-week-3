package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
     By components=By.xpath("//h2");
     public String verifyComponentsText(){
         return getTextFromElement(components);
     }
}
