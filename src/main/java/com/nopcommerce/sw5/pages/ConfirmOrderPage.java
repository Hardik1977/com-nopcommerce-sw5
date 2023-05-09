package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ConfirmOrderPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentMethodText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='subtotal']" )
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement greetingMessage;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']" )
    WebElement continueButton;





    public String verifyPaymentMethodName(){
        Reporter.log("Get Payment method name" + paymentMethodText.toString());
        CustomListeners.test.log(Status.PASS,"Get Payment method name");
        return getTextFromElement(paymentMethodText);
    }

    public String verifyShippingMethodName(){
        Reporter.log("Get shipping method text" + shippingMethodText.toString());
        CustomListeners.test.log(Status.PASS,"Get shipping method text");
        return getTextFromElement(shippingMethodText);
    }

    public String verifyTotalPrice(){
        Reporter.log("Get total price" + totalPriceText.toString());
        CustomListeners.test.log(Status.PASS,"Get total price ");
        return getTextFromElement(totalPriceText);
    }

    public void clickOnConfirmButton(){
        Reporter.log("Click on confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
        CustomListeners.test.log(Status.PASS,"Click on confirm button" );
    }

    public String verifyGreetingMessage(){
        Reporter.log("Get Greeting Message" + greetingMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Greeting Message");
        return getTextFromElement(greetingMessage);
    }

    public String verifyOrderSuccessMessage(){
        Reporter.log("Get Order Success Message" + orderSuccessMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Order Success Message");
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickOnContinueToStorePage(){
        Reporter.log("Click On Continue" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click On Continue");

    }


}


