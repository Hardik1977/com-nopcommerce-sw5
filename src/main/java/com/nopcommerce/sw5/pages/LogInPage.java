package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LogInPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToStoreText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;


    public String verifyTitleOfLoginPage(){
        Reporter.log("Get Title of the page" + welcomeToStoreText.toString());
        CustomListeners.test.log(Status.PASS,"Get Title of the page");
        return getTextFromElement(welcomeToStoreText);
    }

    public void clickOnLogoutLink(){
        Reporter.log("Click On Logout link" + logoutLink.toString());
        clickOnElement(logoutLink);
        CustomListeners.test.log(Status.PASS,"Click On Logout link");

    }


}
