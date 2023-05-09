package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath ="//td[@class='quantity']/child::input")
    WebElement qtyTextBox;

    @CacheLookup
    @FindBy(xpath ="//button[@id='updatecart']")
    WebElement updateShoppingCartButton;

    @CacheLookup
    @FindBy(xpath ="//tr[@class='order-total']//td[@class='cart-total-right']")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(id ="termsofservice")
    WebElement agreementCheckbox;

    @CacheLookup
    @FindBy(id ="checkout")
    WebElement checkoutButton;


    public String verifyTitleOfShoppingCartPage(){
        Reporter.log("Get title of shopping cart page" + shoppingCartText.toString());
        CustomListeners.test.log(Status.PASS,"Get title of shopping cart page" );
        return getTextFromElement(shoppingCartText);
    }

    public void changeTheQty(String qty){
        Reporter.log("Change quantity field" + qtyTextBox.toString());
        clearTextField(qtyTextBox);
        sendTextToElement(qtyTextBox,qty);
        CustomListeners.test.log(Status.PASS,"Change quantity field" + qty );
    }

    public void clickOnUpdateShoppingCartButton(){
        Reporter.log("Click on update shopping cart button" + updateShoppingCartButton.toString());
        clickOnElement(updateShoppingCartButton);
        CustomListeners.test.log(Status.PASS,"Click on update shopping cart button" );
    }

    public String verifyTotalPriceOfProduct(){
        Reporter.log("Get Total price of product" + totalPriceText.toString());
        CustomListeners.test.log(Status.PASS,"Get Total price of product" );
        return getTextFromElement(totalPriceText);
    }

    public void clickOnAgreeWithTermsOfServiceBox(){
        Reporter.log("Click on agree with terms of service checkbox" + agreementCheckbox.toString());
        clickOnElement(agreementCheckbox);
        CustomListeners.test.log(Status.PASS,"Click on agree with terms of service checkbox" );
    }

    public void clickOnCheckoutButton(){
        Reporter.log("Click on Checkout Button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
        CustomListeners.test.log(Status.PASS,"Click on Checkout Button" );
    }






}
