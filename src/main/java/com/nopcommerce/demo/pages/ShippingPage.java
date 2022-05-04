package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {
     By nextDayAirField = By.id("shippingoption_1");
     By twoDayAirField = By.id("shippingoption_2");
     By continueShippingField = By.xpath("//button[@onclick='ShippingMethod.save()']");

//	2.24 Click on Radio Button “Next Day Air($0.00)”
    public void selectNextDayAirField(){
        clickOnElement(nextDayAirField);
    }
    //2.25 Click on “CONTINUE”
    public void selectContinueBtn(){
        clickOnElement(continueShippingField);
    }
    public void selectTwoDayAirField(){
        clickOnElement(twoDayAirField);
    }


}



