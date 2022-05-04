package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {

    By verifyText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By selectOwnBuild = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By selectHhd = By.id("product_attribute_3_7");
    By selectOs = By.id("product_attribute_4_9");
    By software = By.id("product_attribute_5_12");
    By verifyPrice = By.id("price-value-1");
    By addToCart = By.id("add-to-cart-button-1");
    By verifyMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    // 2.5 Verify the Text "Build your own computer"
    public String verifyTextBuildYourOwnComputer(){
        return getTextFromElement(verifyText);
    }
//    public void moveToProcessor(){
//        mouseHoverToElementAndClick(processor);
//    }
    //    2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void clickselectBuildYourOwn(String value){
        mouseHoverToElementAndClick(selectOwnBuild);
        selectByValueFromDropDown(selectOwnBuild,value);
    }
    //    2.7.Select "8GB [+$60.00]" using Select class.
    public void clickOnRam8Gb(String value){
       mouseHoverToElementAndClick(selectRam);
       selectByValueFromDropDown(selectRam,value);

    }
    //    2.8 Select HDD radio "400 GB [+$100.00]"
    public void selectHarddisk(){
        clickOnElement(selectHhd);
    }

    //    2.9 Select OS radio "Vista Premium [+$60.00]"

    public void selectOperatingSystem(){
       clickOnElement(selectOs);
    }
    // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    public void selectSoftware(){
        clickOnElement(software);
    }
    //    2.11 Verify the price "$1,475.00"
    public String verifyTotalPrice(){
        return getTextFromElement(verifyPrice);
    }
    //    2.12 Click on "ADD TO CARD" Button.
    public void clickAddToCartButton(){
        clickOnElement(addToCart);
    }
    //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String verifyMessageInGreenBar(){
        return getTextFromElement(verifyMessage);
    }
    //        After that close the bar clicking on the cross button.
    public void clickOnCloseBar(){
        clickOnElement(closeBar);
    }
    //        2.14 Then MouseHover on "Shopping cart"
    public void hoverToShoopingCart(){
        mouseHoverToElement(shoppingCart);
    }
    //        2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }
}





