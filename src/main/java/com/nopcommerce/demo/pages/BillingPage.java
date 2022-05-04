package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {

    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By cityField = By.id("BillingNewAddress_City");
    By addressField = By.id("BillingNewAddress_Address1");
    By zipCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By continueBtn = By.xpath("//button[@onclick='Billing.save()']");

    //	2.22 Fill the all mandatory field
    public void firstName(String name){
        sendTextToElement(firstNameField, name);
    }
    public void lastName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void email(String email){
        sendTextToElement(emailField,email);
    }
    public void country(String country){
        selectByVisibleTextFromDropDown(countryField,country);
    }
    public void city(String city){
        sendTextToElement(cityField,city);
    }
    public void address(String address){
        sendTextToElement(addressField,address);
    }
    public void zipCode(String zipCode){
        sendTextToElement(zipCodeField,zipCode);
    }
    public void phoneNumber(String number){
        sendTextToElement(phoneNumberField,number);
    }
    //	2.23 Click on “CONTINUE”
    public void continueBtnField(){
        clickOnElement(continueBtn);
    }

}

