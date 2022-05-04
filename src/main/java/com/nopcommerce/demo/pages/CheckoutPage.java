package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By productTotal = By.xpath("//span[@class='product-subtotal']");
    By cofirmOrderBtn = By.xpath("//button[@onclick='ConfirmOrder.save()']");
    By verifyThankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickcOntBtn = By.xpath("//button[@onclick='setLocation(\"/\")']");
    By verifyShippingMethodTwoDay = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By productTotalMobile = By.xpath("//span[@class='product-subtotal']");

    //2.30 Verify “Payment Method” is “Credit Card”
    public String verifyPaymentMethod(){
        return getTextFromElement(verifyPaymentMethod);
    }
    //2.32 Verify “Shipping Method” is “Next Day Air”
    public String verifyShipping(){
        return getTextFromElement(verifyShippingMethod);
    }
    //	2.33 Verify Total is “$2,950.00”
    public String verifyTotal(){
        return getTextFromElement(productTotal);
    }
    //	2.34 Click on “CONFIRM”
    public void confirmOrder(){
        clickOnElement(cofirmOrderBtn);
    }
    //	2.35 Verify the Text “Thank You”
    public String verifyThankYouMessageDisplay(){
        return getTextFromElement(verifyThankYouMessage);
    }
    //	2.36 Verify the message “Your order has been successfully processed!”
    public String verifyOrderPlacedMessage(){
        return getTextFromElement(verifyOrderMessage);
          }
    //	2.37 Click on “CONTINUE”
    public void clickContinueButton(){
        clickOnElement(clickcOntBtn);
    }
    public String verifyTwoDayShipping(){
        return getTextFromElement(verifyShippingMethodTwoDay);
    }
    public String verifyTotalMobile(){
        return getTextFromElement(productTotalMobile);
    }








//2.37 Verify the text “Welcome to our store”
}
