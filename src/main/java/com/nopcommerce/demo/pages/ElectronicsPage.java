package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicsText = By.xpath("//h1[contains(text(),'Electronics')]");
    By cellPhoneTab =  By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By textCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[@title='List']");
    By nokiaLumiaProduct = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By textNokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By priceOfMobile = By.id("price-value-20");
    By changeQty = By.id("product_enteredQuantity_20");
    By addToCart = By.id("add-to-cart-button-20");
    By verifyMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By textShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By totalAmt = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");


    public String getElectronicsText(){
        return getTextFromElement(electronicsText);
    }
    //        1.2 Mouse Hover on “Cell phones” and click
    public void hoverToCellPhoneAndClick(){
        mouseHoverToElementAndClick(cellPhoneTab);
    }
    //        1.3 Verify the text “Cell phones”
    public String verifyTextCellPhone(){
        return getTextFromElement(textCellPhone);
    }
    //        2.4 Click on List View Tab
    public void clickListView(){
        clickOnElement(listViewTab);
    }
    //        2.5 Click on product name “Nokia Lumia 1020” link
    public void clickOnNokiaLumia(){
        mouseHoverToElementAndClick(nokiaLumiaProduct);
    }
    //        2.6 Verify the text “Nokia Lumia 1020”
    public  String verifyTextNokiaLumia(){
        return getTextFromElement(textNokiaLumia);
    }
    //        2.7 Verify the price “$349.00”
    public String verifyTextPrice(){
        return getTextFromElement(priceOfMobile);
    }
    //        2.8 Change quantity to 2
    public void changeOrderQty(String value){
        clearValue(changeQty);
        sendTextToElement(changeQty,value);
    }
    //        2.9 Click on “ADD TO CART” tab
    public void clickAddToCartBtn(){
        clickOnElement(addToCart);
    }
    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String verifyMessageInGreenBar(){
        return getTextFromElement(verifyMessage);
    }
    //        After that close the bar clicking on the cross button.
    public void clickOnCloseBar(){
        clickOnElement(closeBar);
    }
    //        2.11 Then MouseHover on "Shopping cart"
    public void hoverToShoopingCart(){
        mouseHoverToElement(shoppingCart);
    }
    //        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }
    //        2.12 Verify the message "Shopping cart"
    public String verifyTextShoppingCart(){
        return getTextFromElement(textShoppingCart);
    }
    //        2.14 Verify the Total $698.00
    public String verifyTotalAmt(){
        return getTextFromElement(totalAmt);
    }




}

//        2.38 Click on “CONFIRM”
//        2.39 Verify the Text “Thank You”
//        2.40 Verify the message “Your order has been successfully processed!”
//        2.41 Click on “CONTINUE”
//        2.42 Verify the text “Welcome to our store”
//        2.43 Click on “Logout” link
//        2.44 Verify the URL is “https://demo.nopcommerce.com
