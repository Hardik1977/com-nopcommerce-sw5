package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentMethodPage extends Utility {

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']/descendant::a/following::button[1]")
    WebElement continueButton;

    public void clickOnCreditCardRadioButton() {
        Reporter.log("Click on credit card radio button" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
        CustomListeners.test.log(Status.PASS, "Click on credit card radio button");
    }

    public void clickOnContinueButtonToPaymentInformation() {
        Reporter.log("Click on Continue button" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue button");
    }

}
