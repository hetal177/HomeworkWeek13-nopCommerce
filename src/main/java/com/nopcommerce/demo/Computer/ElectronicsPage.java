package com.nopcommerce.demo.Computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsPageTitle = By.xpath("//h1[normalize-space()='Electronics']");


    public String getElectronicsPageTitle(){

        return getTextElement(electronicsPageTitle);
    }

}