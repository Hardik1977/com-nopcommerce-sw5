package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhonesText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]" )
    WebElement productNokiaLumia;




    public String verifyCellPhonesText(){
        Reporter.log("Get text from cell phones" + cellPhonesText.toString());
        CustomListeners.test.log(Status.PASS,"Get text from cell phones ");
        return  getTextFromElement(cellPhonesText);
    }

    public void clickOnListViewTab(){
        Reporter.log("Click on List View Tab" + listViewTab.toString());
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS,"Click on List View Tab" );
    }

    public void clickOnNokiaLumiaCellPhone(){
        Reporter.log("Click on Nokia Lumia Phone" + productNokiaLumia.toString());
        clickOnElement(productNokiaLumia);
        CustomListeners.test.log(Status.PASS,"Click on Nokia Lumia Phone" );
    }



}
