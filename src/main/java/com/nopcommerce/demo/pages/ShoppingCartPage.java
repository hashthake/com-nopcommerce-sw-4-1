package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//input[@value='1']");
    By updateShoppingCart = By.id("updatecart");
    By verifyTotal = By.xpath("//span[@class='product-subtotal']");
    By clickOnChecBox = By.id("termsofservice");
    By clickOnCheckout = By.id("checkout");
    By verifySignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickOnCheckoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");

    //2.15 Verify the message "Shopping cart"
    public String verifyTextShoppingCart(){
        return getTextFromElement(verifyMessageShoppingCart);
    }
    //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void changeQty(String value)  {
        clearValue(quantity);
        sendTextToElement(quantity,value);
    }
    public void clickOnUpdateCart(){
        mouseHoverToElementAndClick(updateShoppingCart);
    }
    //	2.17 Verify the Total"$2,950.00"
    public String verifyTextTotal(){
        return getTextFromElement(verifyTotal);
    }
    //	2.18 click on checkbox “I agree with the terms of service”
    public void clickOnAcceptTermsCheckBox(){
        mouseHoverToElementAndClick(clickOnChecBox);
    }
    //	2.19 Click on “CHECKOUT”
    public void clickOnCheckoutBtn(){
        clickOnElement(clickOnCheckout);
    }
    //	2.20 Verify the Text “Welcome, Please Sign In!”
    public String verifyWelcomeSignInText(){
        return getTextFromElement(verifySignInText);
    }
    //	2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckoutBtnAsGuest(){
        clickOnElement(clickOnCheckoutAsGuest);
    }




}



