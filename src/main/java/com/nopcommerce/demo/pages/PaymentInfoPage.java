package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentInfoPage extends Utility {

    By selectCreditCardField = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expirationDateByMonth = By.id("ExpireMonth");
    By expirationDateByYear = By.id("ExpireYear");
    By cardCodeField = By.id("CardCode");
    By selectContinueBtn = By.xpath("//button[@onclick='PaymentInfo.save()']");

    //2.27 Select “Master card” From Select credit card dropdown
    public void selectCreditCard(String value){
        selectByVisibleTextFromDropDown(selectCreditCardField,value);
    }
    //2.28 Fill all the details
    public void cardHolderName(String name){
        sendTextToElement(cardHolderNameField,name);
    }
    public void cardNumber(String cardNumber){
        sendTextToElement(cardNumberField,cardNumber);
    }
    public void expirationDBM(){
        selectByVisibleTextFromDropDown(expirationDateByMonth, "08");
    }
    public void expirationDBY(){
        selectByVisibleTextFromDropDown(expirationDateByYear, "2024");
    }
    public void cardCode(String cvv){
        sendTextToElement(cardCodeField,cvv);
    }
    //2.29 Click on “CONTINUE”
    public void selectConBtn(){
        clickOnElement(selectContinueBtn);
    }

}
//2.30 Verify “Payment Method” is “Credit Card”
//2.32 Verify “Shipping Method” is “Next Day Air”
//	2.33 Verify Total is “$2,950.00”
//	2.34 Click on “CONFIRM”
//	2.35 Verify the Text “Thank You”
//	2.36 Verify the message “Your order has been successfully processed!”
//	2.37 Click on “CONTINUE”
//2.37 Verify the text “Welcome to our store”