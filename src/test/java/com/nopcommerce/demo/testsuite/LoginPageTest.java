package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //Find log in link and click log in
        homePage.clickOnLoginTab();

        // verification of the message
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage= loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }




    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find log in link and click log in
        homePage.clickOnLoginTab();

        //find email field and enter email address
        loginPage.enterEmailId("rlobo@gmail.co.uk");

        //find password field amd enter password
        loginPage.enterPasswordField("rlobo123");

        //find login button and click it
        loginPage.clickLoginButton();

        // * Verify the ‘Log out’ text is display
        String expectedMessage = "Log out";
        String actualMessage= loginPage.getLogOutText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }


    @Test
    public void verifyTheErrorMessage() {
        //Find log in link and click log in
        homePage.clickOnLoginTab();

        //find email field and enter email address
        loginPage.enterEmailId("rlobo@gmail.co.uk");

        //find password field amd enter password
        loginPage.enterPasswordField("rlobo123");

        //find login button and click it
        loginPage.clickLoginButton();

        // Expected error message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage= loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

}
