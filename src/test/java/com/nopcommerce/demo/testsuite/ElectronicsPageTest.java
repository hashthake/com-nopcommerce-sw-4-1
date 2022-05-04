package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.experimental.theories.Theories;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    RegistrationPage registrationPage = new RegistrationPage();
    BillingPage billingPage = new BillingPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test

    public void verifyProductAddedToCartSuccessfully() throws InterruptedException {
        //        1.1 Mouse Hover on “Electronics” Tab
        homePage.hoverToElectronics();
        Thread.sleep(1000);
        //        1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.hoverToCellPhoneAndClick();
        //        1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = electronicsPage.verifyTextCellPhone();
        Assert.assertEquals(expectedText,actualText);
        Thread.sleep(2000);
        //        2.4 Click on List View Tab
        electronicsPage.clickListView();
        Thread.sleep(3000);
        //        2.5 Click on product name “Nokia Lumia 1020” link
        electronicsPage.clickOnNokiaLumia();
        Thread.sleep(3000);
        //        2.6 Verify the text “Nokia Lumia 1020”
        String expectedText1 = "Nokia Lumia 1020";
        String actualText1 = electronicsPage.verifyTextNokiaLumia();
        Assert.assertEquals(expectedText1,actualText1);
        //        2.7 Verify the price “$349.00”
        String expectedText2 = "$349.00";
        String actualText2 = electronicsPage.verifyTextPrice();
        Assert.assertEquals(expectedText2,actualText2);
        Thread.sleep(3000);
        //        2.8 Change quantity to 2
        electronicsPage.changeOrderQty("2");
        Thread.sleep(3000);
        //        2.9 Click on “ADD TO CART” tab
        electronicsPage.clickAddToCartBtn();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText3 = "The product has been added to your shopping cart";
        String actualText3 = electronicsPage.verifyMessageInGreenBar();
        electronicsPage.clickOnCloseBar();
        Thread.sleep(3000);
        //        2.11 Then MouseHover on "Shopping cart"
        electronicsPage.hoverToShoopingCart();
        Thread.sleep(3000);
        //        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        electronicsPage.clickOnGoToCart();
        Thread.sleep(3000);
        //        2.12 Verify the message "Shopping cart"
        String expectedText4 = "Shopping cart";
        String actualText4 = electronicsPage.verifyTextShoppingCart();
        Assert.assertEquals(expectedText4,actualText4);
        Thread.sleep(3000);
        //        2.14 Verify the Total $698.00
        String expectedText5 = "$698.00";
        String actualText5 = electronicsPage.verifyTotalAmt();
        Assert.assertEquals(expectedText5,actualText5);
        Thread.sleep(3000);
        //        2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnAcceptTermsCheckBox();
        //        2.16 Click on checkout
        shoppingCartPage.clickOnCheckoutBtn();
        Thread.sleep(1000);
        //        “2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText6 = "Welcome, Please Sign In!";
        String actualText6 = shoppingCartPage.verifyWelcomeSignInText();
        Assert.assertEquals(expectedText6,actualText6);
        Thread.sleep(3000);
        //        2.18 Click on “REGISTER” tab
        registrationPage.clickOnRegisterBtn();
        Thread.sleep(3000);
//        2.19 Verify the text “Register”
        String expectedText7 = "Register";
        String actualText7 = registrationPage.getRegisterText();
        Assert.assertEquals(expectedText7,actualText7);
        Thread.sleep(3000);
//        2.20 Fill the mandatory fields
        registrationPage.clickMaleGender();
        registrationPage.setFirstName("Carl");
        registrationPage.setLastName("Barby");
        registrationPage.addEmail("abcdef@gmail.com");
        registrationPage.setPassword("Abc1234");
        registrationPage.setConfirmPassword("Abc1234");
        // 2.21 Click on “REGISTER” Button
        registrationPage.clickRegisterButton();
        Thread.sleep(3000);
        //        2.22 Verify the message “Your registration completed”
        String expectedText8 = "Your registration completed";
        String actualText8 = registrationPage.getRegistrationText();
        Assert.assertEquals(expectedText8,actualText8);
        Thread.sleep(3000);
        //        2.23 Click on “CONTINUE” tab
       registrationPage.clickContinue();
       Thread.sleep(3000);
        //        2.24 Verify the text “Shopping cart”
       String expectedText9 = "Shopping cart";
       String actualText9 = shoppingCartPage.verifyTextShoppingCart();
       Assert.assertEquals(expectedText9,actualText9);
       Thread.sleep(2000);
        //        2.25 click on checkbox “I agree with the terms of service”
       shoppingCartPage.clickOnAcceptTermsCheckBox();
        //        2.26 Click on “CHECKOUT”
       shoppingCartPage.clickOnCheckoutBtn();
       Thread.sleep(3000);
        //        2.27 Fill the Mandatory fields
       billingPage.country("United Kingdom");
       billingPage.city("London");
       billingPage.address("20 Carl Street");
       billingPage.zipCode("CV11VC");
       billingPage.phoneNumber("1234567899");
        //        2.28 Click on “CONTINUE”
       billingPage.continueBtnField();
       Thread.sleep(3000);
        //        2.29 Click on Radio Button “2nd Day Air ($0.00)”
        shippingPage.selectTwoDayAirField();
        ////        2.30 Click on “CONTINUE”
        shippingPage.selectContinueBtn();
        Thread.sleep(2000);
        //        2.31 Select Radio Button “Credit Card”
        paymentMethodPage.selectCreditCardOtion();
        paymentMethodPage.selecctCont();
        //        2.32 Select “Visa” From Select credit card dropdown
        paymentInfoPage.selectCreditCard("Visa");
//        2.33 Fill all the details
        paymentInfoPage.cardHolderName("Carl");
        paymentInfoPage.cardNumber("5512345678912345");
        paymentInfoPage.expirationDBM();
        paymentInfoPage.expirationDBY();
        paymentInfoPage.cardCode("475");
        Thread.sleep(1000);
//        2.34 Click on “CONTINUE”CHECKOUT”
        paymentInfoPage.selectConBtn();
        Thread.sleep(3000);
        //        2.35 Verify “Payment Method” is “Credit Card”
        String expectedText10 = "Credit Card";
        String actualText10 = checkoutPage.verifyPaymentMethod();
        Assert.assertEquals(expectedText10,actualText10);
        Thread.sleep(3000);
        //        2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedText11 = "2nd Day Air";
        String actualText11 = checkoutPage.verifyTwoDayShipping();
        Assert.assertEquals(expectedText7,actualText7);
        Thread.sleep(3000);
//        2.37 Verify Total is “$698.00”
        String expectedText12 = "$698.00";
        String actualText12 = checkoutPage.verifyTotalMobile();
        Assert.assertEquals(expectedText12,actualText12);
        Thread.sleep(2000);
        //        2.38 Click on “CONFIRM”
        checkoutPage.confirmOrder();
        //        2.39 Verify the Text “Thank You”
        String expectedText13 = "Thank you";
        String actualText13 = checkoutPage.verifyThankYouMessageDisplay();
        Assert.assertEquals(expectedText13,actualText13);
        Thread.sleep(2000);
        //        2.40 Verify the message “Your order has been successfully processed!”
        String expectedText14 = "Your order has been successfully processed!";
        String actualText14 = checkoutPage.verifyOrderPlacedMessage();
        Assert.assertEquals(expectedText14,actualText14);
        Thread.sleep(2000);
        //        2.41 Click on “CONTINUE”
        checkoutPage.clickContinueButton();
        //        2.42 Verify the text “Welcome to our store”
       homePage.verifyWelcomeMessage();
       Thread.sleep(2000);
       registrationPage.logOutBtn();







    }
}