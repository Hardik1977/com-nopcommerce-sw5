package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement signInText;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement checkoutWithRegister;

    @CacheLookup
    @FindBy(id = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@class='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;


    public String verifyTitleOfSignPage() {
        return getTextFromElement(signInText);
    }

    public void clickOnCheckoutAsGuestButton() {
        Reporter.log("Click on checkout as guest button" + checkoutAsGuestButton.toString());
        clickOnElement(checkoutAsGuestButton);
        CustomListeners.test.log(Status.PASS, "Click on checkout as guest button");
    }

    public void clickOnRegisterTab() {
        Reporter.log("Click on register tab" + checkoutWithRegister.toString());
        clickOnElement(checkoutWithRegister);
        CustomListeners.test.log(Status.PASS, "Click on register tab");
    }

    public void enterEmail(String email) {
        Reporter.log("Enter email" + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter email");

    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password");

    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login button" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on login button");
    }


}
