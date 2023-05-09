package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement productAddedToCartMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(id = "topcartlink")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartButton;

    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement priceOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement priceTextOfNokiaLumia;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement qtyTextBox;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartTab;


    public String verifyTitleOfBuildYourOwnComputerProduct() {
        Reporter.log("Get text of title of build your own computer" + buildYourOwnComputerText.toString());
        CustomListeners.test.log(Status.PASS, "Get text of title of build your own computer");
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessorsOfBuildYourOwnComputer(String processor) {
        Reporter.log("Select processor" + processorOfBuildYourOwnComputer.toString());
        selectByVisibleTextFromDropDown(processorOfBuildYourOwnComputer, processor);
        CustomListeners.test.log(Status.PASS, "Select processor" + processor);
    }

    public void selectRamOfBuildYourOwnComputer(String ram) {
        Reporter.log("Select ram" + ramOfBuildYourOwnComputer.toString());
        selectByVisibleTextFromDropDown(ramOfBuildYourOwnComputer, ram);
        CustomListeners.test.log(Status.PASS, "Select ram" + ram);
    }

    public void clickOnHddOfBuildYourOwnComputer() {
        Reporter.log("Click on desired HDD Of computer" + hddOfBuildYourOwnComputer.toString());
        clickOnElement(hddOfBuildYourOwnComputer);
        CustomListeners.test.log(Status.PASS, "Click on desired HDD Of computer");
    }

    public void clickOnOsOfBuildYourOwnComputer() {
        Reporter.log("Click on desired OS Of computer" + osOfBuildYourOwnComputer.toString());
        clickOnElement(osOfBuildYourOwnComputer);
        CustomListeners.test.log(Status.PASS, "Click on desired OS Of computer");
    }

    public void clickOnSoftwareOfBuildYourOwnComputer() {
        Reporter.log("Click on desired Software Of computer" + softwareOfBuildYourOwnComputer.toString());
        clickOnElement(softwareOfBuildYourOwnComputer);
        CustomListeners.test.log(Status.PASS, "Click on desired Software Of computer");
    }

    public String verifyPriceOfBuildYourOwnComputer() {
        Reporter.log("Get Price of Computer" + priceOfBuildYourOwnComputer.toString());
        CustomListeners.test.log(Status.PASS, "Get Price of Computer");
        return getTextFromElement(priceOfBuildYourOwnComputer);
    }


    public void clickOnAddToCartAfterFiltersAdded() {
        Reporter.log("Click on Add to cart" + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Add to cart");
        clickOnElement(addToCartButton);
    }

    public String verifyMessageOfProductAddedToCart() {
        Reporter.log("Get Product added successfully message" + productAddedToCartMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Product added successfully message");
        return getTextFromElement(productAddedToCartMessage);
    }

    public void clickOnCloseBarToCloseMessage() {
        Reporter.log("Click on Close bar message" + closeMessage.toString());
        clickOnElement(closeMessage);
        CustomListeners.test.log(Status.PASS, "Click on Close bar message");
    }

    public void mouseHoverOnShoppingCartLink() {
        Reporter.log("Mouse hover on shopping cart link" + shoppingCartLink.toString());
        mouseHoverToElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Mouse hover on shopping cart link");
    }

    public void mouseHoverAndClickOnGoToCartButton() {
        Reporter.log("Mouse hover and click on Go to cart button" + goToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover and click on Go to cart button");
        mouseHoverToElementAndClick(goToCartButton);
    }

    public String verifyNokiaLumia1020() {
        Reporter.log("Get NokiaLumia1020 text" + nokiaLumiaText.toString());
        CustomListeners.test.log(Status.PASS, "Get NokiaLumia1020 text");
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPriceOfNokiaLumia() {
        Reporter.log("Get price of Nokia Lumia" + priceTextOfNokiaLumia.toString());
        CustomListeners.test.log(Status.PASS, "Get price of Nokia Lumia");
        return getTextFromElement(priceTextOfNokiaLumia);
    }

    public void changeTheQty(String qty) {
        Reporter.log("Enter quantity" + qtyTextBox.toString());
        clearTextField(qtyTextBox);
        sendTextToElement(qtyTextBox, qty);
        CustomListeners.test.log(Status.PASS, "Enter quantity" + qty);
    }

    public void addToCartNokiaLumiaCellPhone() {
        Reporter.log("Click on Add to cart" + addToCartTab.toString());
        clickOnElement(addToCartTab);
        CustomListeners.test.log(Status.PASS, "Click on Add to cart");
    }

}
