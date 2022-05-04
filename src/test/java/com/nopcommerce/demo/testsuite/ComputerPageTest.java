package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    BuildYourOwnComputer buildyourcomputer = new BuildYourOwnComputer();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    BillingPage billingPage = new BillingPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // Clickon Homepage
        homePage.clickOnComputerTab();
        //Click on Computer Tab
        computerPage.clickOnDesktop();
        // Select sort by position "Name A to Z"
        mouseHoverToElement(By.xpath("//select[@id='products-orderby']"));
        computerPage.selectNameAToZ("5");
        Thread.sleep(2000);
        // Click on Add to cart of build your own
        computerPage.clickAddToCart();
        Thread.sleep(2000);
        //Verify Text
        String epectedText = "Build your own computer";
        String actualText = buildyourcomputer.verifyTextBuildYourOwnComputer();
        Assert.assertEquals(epectedText,actualText);
        Thread.sleep(1000);

        //buildyourcomputer.moveToProcessor();
        //    2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildyourcomputer.clickselectBuildYourOwn("1");
        //    2.7.Select "8GB [+$60.00]" using Select class.
        buildyourcomputer.clickOnRam8Gb("5");
        Thread.sleep(2000);
        //    2.8 Select HDD radio "400 GB [+$100.00]"
        buildyourcomputer.selectHarddisk();
        //    2.9 Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(3000);
        buildyourcomputer.selectOperatingSystem();
        Thread.sleep(3000);
        //// 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildyourcomputer.selectSoftware();
        Thread.sleep(3000);
        // //    2.11 Verify the price "$1,475.00"
        String expectedText1 = "$1,475.00";
        String actualText1 = buildyourcomputer.verifyTotalPrice();
        Assert.assertEquals(actualText1,expectedText1);
        buildyourcomputer.clickAddToCartButton();
        Thread.sleep(3000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = buildyourcomputer.verifyMessageInGreenBar();
        buildyourcomputer.clickOnCloseBar();
        Thread.sleep(2000);
        //        2.14 Then MouseHover on "Shopping cart"
        buildyourcomputer.hoverToShoopingCart();
        Thread.sleep(3000);
        //        2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        buildyourcomputer.clickOnGoToCart();
        Thread.sleep(3000);
        //2.15 Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 = shoppingCartPage.verifyTextShoppingCart();
        Assert.assertEquals(expectedText3,actualText3);
        Thread.sleep(3000);
        //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQty("2");
        Thread.sleep(2000);
       shoppingCartPage.clickOnUpdateCart();
        //	2.17 Verify the Total"$2,950.00"
        String expectedText4 = "$2,950.00";
        String actualText4 = shoppingCartPage.verifyTextTotal();
        Assert.assertEquals(expectedText4,actualText4);
        Thread.sleep(3000);
        shoppingCartPage.clickOnAcceptTermsCheckBox();
        shoppingCartPage.clickOnCheckoutBtn();
        Thread.sleep(1000);
        String expectedText5 = "Welcome, Please Sign In!";
        String actualText5 = shoppingCartPage.verifyWelcomeSignInText();
        Assert.assertEquals(expectedText5,actualText5);
        Thread.sleep(2000);
        shoppingCartPage.clickOnCheckoutBtnAsGuest();
        Thread.sleep(2000);
        //	2.22 Fill the all mandatory field
        billingPage.firstName("Carl");
        billingPage.lastName("Barby");
        billingPage.email("abc@gmail.com");
        billingPage.country("United Kingdom");
        billingPage.city("London");
        billingPage.address("20 Manion Avenue");
        billingPage.zipCode("CV11VC");
        billingPage.phoneNumber("1234567899");
        Thread.sleep(1000);
        //	2.23 Click on “CONTINUE”
        billingPage.continueBtnField();
        Thread.sleep(3000);
        //	2.24 Click on Radio Button “Next Day Air($0.00)”
        shippingPage.selectNextDayAirField();
        //2.25 Click on “CONTINUE”
        shippingPage.selectContinueBtn();
        Thread.sleep(3000);
        //2.26 Select Radio Button “Credit Card”
        paymentMethodPage.selectCreditCardOtion();
        paymentMethodPage.selecctCont();
        Thread.sleep(3000);
        //2.27 Select “Master card” From Select credit card dropdown
        paymentInfoPage.selectCreditCard("Master card");
        //2.28 Fill all the details
        paymentInfoPage.cardHolderName("Carl");
        paymentInfoPage.cardNumber("5512345678912345");
        paymentInfoPage.expirationDBM();
        paymentInfoPage.expirationDBY();
        paymentInfoPage.cardCode("475");
        Thread.sleep(1000);
        //2.29 Click on “CONTINUE”
        paymentInfoPage.selectConBtn();
        Thread.sleep(3000);
        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedText6 = "Credit Card";
        String actualText6 = checkoutPage.verifyPaymentMethod();
        Assert.assertEquals(expectedText6,actualText6);
        ////2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedText7 = "Next Day Air";
        String actualText7 = checkoutPage.verifyShipping();
        Assert.assertEquals(expectedText7,actualText7);
        //	2.33 Verify Total is “$2,950.00”
        String expectedText8 = "$2,950.00";
        String actualText8 = checkoutPage.verifyTotal();
        Thread.sleep(2000);
        //	2.34 Click on “CONFIRM”
        checkoutPage.confirmOrder();
        ////	2.35 Verify the Text “Thank You”
        String expectedText9 = "Thank you";
        String actualText9 = checkoutPage.verifyThankYouMessageDisplay();
        Assert.assertEquals(expectedText9,actualText9);
        Thread.sleep(1000);
        //	2.36 Verify the message “Your order has been successfully processed!”
        String expectedText10 = "Your order has been successfully processed!";
        String actualText10 = checkoutPage.verifyOrderPlacedMessage();
        Assert.assertEquals(expectedText10,actualText10);
        Thread.sleep(1000);
        //	2.37 Click on “CONTINUE”
        checkoutPage.clickContinueButton();
        Thread.sleep(2000);
        // Verify "Welcome to our store"
        String expectedText11 = "Welcome to our store";
        String actualText11 = homePage.verifyWelcomeMessage();
        Assert.assertEquals(expectedText11,actualText11);



    }
}
