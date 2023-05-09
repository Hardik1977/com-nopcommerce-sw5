package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DeskTopsPage extends Utility {

    @CacheLookup
    @FindBy(id = "products-orderby" )
    WebElement sortByTextField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='details']/child::h2/a")
    List<WebElement> allProductsOnPageLinks;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;



    public void selectSortByName(String text){
        Reporter.log("Select SortBy" + sortByTextField.toString());
        selectByVisibleTextFromDropDown(sortByTextField, text);
        CustomListeners.test.log(Status.PASS,"Select SortBy" + text);
    }



    public void addBuildYourOwnComputerProductInCart(){
        Reporter.log("Click on build your own computer" + buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);
        CustomListeners.test.log(Status.PASS,"Click on build your own computer");

    }

    public ArrayList<String> getProductNameList(){
        Reporter.log("Get list of products" + allProductsOnPageLinks.toString());
        List<WebElement> products = allProductsOnPageLinks;
        ArrayList<String> originalProductsName = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElements(products));
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        CustomListeners.test.log(Status.PASS,"Get list of products" );
        return originalProductsName;
    }





    public void selectProductByName(String product) {
        List<WebElement> products = allProductsOnPageLinks;
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }

    public void selectSortByOption(String option) {
        Reporter.log("Select sortBy option" + sortByTextField.toString());
        selectByVisibleTextFromDropDown(sortByTextField, option);
        CustomListeners.test.log(Status.PASS,"Select sortBy option" + option);
    }

}
