package com.nopcommerce.demo.Computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class SigninPage extends Utility {

    By verifySignInPg = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By cickonCheckOutAsGuest =By.xpath("//button[normalize-space()='Checkout as Guest']");

    public String setVerifySignInPg(){
        return getTextElement(verifySignInPg);
    }
    public void setCickonCheckOutAsGuest(){
        clickOnElement(cickonCheckOutAsGuest);
    }


}

