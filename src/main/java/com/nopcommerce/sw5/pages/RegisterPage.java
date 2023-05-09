package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTitle;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;



    public String verifyRegisterTitle(){
        Reporter.log("Get Register Title" + registerTitle.toString());
        CustomListeners.test.log(Status.PASS,"Get Register Title" );
        return getTextFromElement(registerTitle);
    }

    public void enterFirstName(String firstName){
        Reporter.log("Enter Firstname" + firstNameField.toString());
        sendTextToElement(firstNameField,firstName);
        CustomListeners.test.log(Status.PASS,"Enter Firstname" + firstName);
    }

    public void enterLastName(String lastName){
        Reporter.log("Enter Lastname" + lastNameField.toString());
        sendTextToElement(lastNameField,lastName);
        CustomListeners.test.log(Status.PASS,"Enter Lastname" + lastName);
    }
    public void enterEmail(String email){
        Reporter.log("Enter EmailId" + emailField.toString());
        sendTextToElement(emailField,email);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);

    }
    public void enterPassword(String password){
        Reporter.log("Enter password" + passwordField.toString());
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS,"Enter Password " + password);


    }
    public void enterConfirmPassword(String confirmPassword){
        Reporter.log("Enter Confirm password" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField,confirmPassword);
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password " + confirmPassword);
    }

    public void clickOnRegisterButton(){
        Reporter.log("Click on register button" + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click on register button");
    }

    public String verifyRegistrationMessage(){
        Reporter.log("Get Registration Message" + registrationMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Registration Message" );
        return getTextFromElement(registrationMessage);
    }

    public void clickOnContinueToShoppingCart(){
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on continue button");
    }

    public void clickOnLoginLink(){
        Reporter.log("Click on login link" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on login link");
    }


}
