package com.nopcommerce.demo.Electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsRegister extends Utility {
    By register = By.xpath("//button[contains(text(),'Register')]");



    public void ClickOnRegisterButton(){
        clickOnElement(register);
    }

}
