package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShippingMethodPage extends Utility {

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAirRadiobutton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement secondDayAirRadioButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;


    public void clickOnNextDayAirShippingMethod() {
        Reporter.log("Click on Next day Air shipping" + nextDayAirRadiobutton.toString());
        clickOnElement(nextDayAirRadiobutton);
        CustomListeners.test.log(Status.PASS, "Click on Next day Air shipping");
    }

    public void clickOnSecondDayAirShippingMethod() {
        Reporter.log("Click on second day air shipping" + secondDayAirRadioButton.toString());
        clickOnElement(secondDayAirRadioButton);
        CustomListeners.test.log(Status.PASS, "Click on second day air shipping");
    }

    public void clickOnContinueForPaymentMethod() {
        Reporter.log("Click on continue" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue");

    }

}
