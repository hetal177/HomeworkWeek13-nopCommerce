package com.nopcommerce.demo.Computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryPageTitle = By.xpath("//h1[normalize-space()='Jewelry']");
    public String getJewelryPageTitle(){
        return getTextElement(jewelryPageTitle);
    }

}
