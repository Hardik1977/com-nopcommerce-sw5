package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentInformationPage extends Utility {

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardField;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expiredYearField;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton;


    public void selectCreditCardType(String creditCardType){
        Reporter.log("Select Credit Card Type" + creditCardField.toString());
        selectByVisibleTextFromDropDown(creditCardField, creditCardType);
        CustomListeners.test.log(Status.PASS,"Select Credit Card Type" + creditCardType);
    }

    public void enterCardHolderName(String cardHolderName){
        Reporter.log("Enter CarHolder Name" + cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField,cardHolderName);
        CustomListeners.test.log(Status.PASS,"Enter CarHolder Name" + cardHolderName);
    }

    public void enterCardNumber(String cardNumber){
        Reporter.log("Enter CardNumber" + cardNumberField.toString());
        sendTextToElement(cardNumberField, cardNumber);
        CustomListeners.test.log(Status.PASS,"Enter CardNumber" + cardNumber);
    }

    public void selectExpiryMonth(String expiredMonth){
        Reporter.log("Select Expiry Month" + expireMonthField.toString());
        selectByVisibleTextFromDropDown(expireMonthField, expiredMonth);
        CustomListeners.test.log(Status.PASS,"Select Expiry Month" + expiredMonth);
    }
    public void selectExpiryYear(String expiredYear){
        Reporter.log("Select Expiry Year" + expiredYearField.toString());
        selectByVisibleTextFromDropDown(expiredYearField, expiredYear);
        CustomListeners.test.log(Status.PASS,"Select Expiry Year" + expiredYear);
    }

    public void enterCardCode(String cardCode){
        Reporter.log("Enter card code" + cardCodeField.toString());
        sendTextToElement(cardCodeField, cardCode);
        CustomListeners.test.log(Status.PASS,"Enter card code" + cardCode);
    }

    public void clickOnContinueToConfirmOrder(){
        Reporter.log("Click on Continue" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on Continue");

    }


}
