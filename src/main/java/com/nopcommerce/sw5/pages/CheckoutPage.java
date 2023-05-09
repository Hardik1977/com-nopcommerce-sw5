package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement numberField;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;




    public void enterFirstName(String firstName){
        Reporter.log("Enter Firstname" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS,"Enter Firstname " + firstName);
    }

    public void enterLastName(String lastName){
        Reporter.log("Enter Lastname" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS,"Enter Lastname" + lastName);
    }

    public void enterEmail(String email){
        Reporter.log("Enter EmailId" + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);
    }

    public void selectCountryFromCountryField(String country){
        Reporter.log("Select country" + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, country);
        CustomListeners.test.log(Status.PASS,"Select country" + country);
    }


    public void enterCity(String city){
        Reporter.log("Enter City" + cityField.toString());
        sendTextToElement(cityField, city);
        CustomListeners.test.log(Status.PASS,"Enter City" + city);
    }

    public void enterAddress(String address){
        Reporter.log("Enter Address" + addressField.toString());
        sendTextToElement(addressField, address);
        CustomListeners.test.log(Status.PASS,"Enter Address" + address);
    }

    public void enterPostalCode(String postcode){
        Reporter.log("Enter Postcode" + postalCodeField.toString());
        sendTextToElement(postalCodeField, postcode);
        CustomListeners.test.log(Status.PASS,"Enter Postcode" + postcode);
    }

    public void enterNumber(String number){
        Reporter.log("Enter Number" + numberField.toString());
        sendTextToElement(numberField, number);
        CustomListeners.test.log(Status.PASS,"Enter Number " + number);
    }

    public void clickOnContinueButtonToShippingMethod(){
        Reporter.log("Click on Continue" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on Continue");
    }


}

