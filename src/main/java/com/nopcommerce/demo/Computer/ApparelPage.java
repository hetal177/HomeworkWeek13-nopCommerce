package com.nopcommerce.demo.Computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelTitle = By.xpath("//h1[normalize-space()='Apparel']");
    public String getApparelPageTitle(){
        return getTextElement(apparelTitle);
    }

}
