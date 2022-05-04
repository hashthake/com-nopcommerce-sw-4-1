package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {

    By selectCreditCardField = By.id("paymentmethod_1");
    By selectContinue = By.xpath("//button[@onclick='PaymentMethod.save()']");

    //2.26 Select Radio Button “Credit Card”
    public void selectCreditCardOtion(){
        clickOnElement(selectCreditCardField);
    }

    public void selecctCont(){
        clickOnElement(selectContinue);
    }
}


//2.27 Select “Master card” From Select credit card dropdown
//2.28 Fill all the details
//2.29 Click on “CONTINUE”
//2.30 Verify “Payment Method” is “Credit Card”
//2.32 Verify “Shipping Method” is “Next Day Air”
//	2.33 Verify Total is “$2,950.00”
//	2.34 Click on “CONFIRM”
//	2.35 Verify the Text “Thank You”
//	2.36 Verify the message “Your order has been successfully processed!”
//	2.37 Click on “CONTINUE”
//2.37 Verify the text “Welcome to our store”