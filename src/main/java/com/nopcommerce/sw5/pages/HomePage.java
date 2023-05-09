package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/child::li")
    List<WebElement> allTopMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersTopMenuTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTopMenuTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
    WebElement electronicsTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath =  "//h1[contains(text(),'Apparel')]")
    WebElement apparelTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadsTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement booksTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Jewelry')]")
    WebElement jewelryTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Gift Cards')]")
    WebElement giftsCardsTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopDropDownLinkOfComputers;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']" )
    WebElement cellPhonesLink;


    public void selectAllTopMenuTabs(String text){
        Reporter.log("select all top menu" + allTopMenu.toString());
        listOfElements(allTopMenu,text);
        CustomListeners.test.log(Status.PASS,"select all top menu" + text);

    }

    public void clickOnComputersTopMenu(){
        Reporter.log("Click on computers top menu" + computersTopMenuTab.toString());
        clickOnElement(computersTopMenuTab);
        CustomListeners.test.log(Status.PASS,"Click on computers top menu");
    }

    public String verifyPaveNavigationOfComputerTopMenuTab(){
        Reporter.log("Verify page navigation of computer top menu" + computersTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of computer top menu");
        return getTextFromElement(computersTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfElectronicsTopMenuTab(){
        Reporter.log("Verify page navigation of electronics top menu" + electronicsTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of electronics top menu");
        return getTextFromElement(electronicsTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfApparelTopMenuTab(){
        Reporter.log("Verify page navigation of apparel top menu" + apparelTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of apparel top menu");
        return getTextFromElement(apparelTopMenuPageTitle);
    }



    public String verifyPaveNavigationOfDigitalDownloadsTopMenuTab() {
        Reporter.log("Verify page navigation of digital downloads top menu" + digitalDownloadsTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of digital downloads top menu");
        return getTextFromElement(digitalDownloadsTopMenuPageTitle);
    }



    public String verifyPaveNavigationOfBooksTopMenuTab(){
        Reporter.log("Verify page navigation of books top menu" + booksTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of books top menu");
        return getTextFromElement(booksTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfJewelryTopMenuTab(){
        Reporter.log("Verify page navigation of jewelry top menu" + jewelryTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of jewelry top menu");
        return getTextFromElement(jewelryTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfGiftCardsTopMenuTab(){
        Reporter.log("Verify page navigation of gift cards top menu" + giftsCardsTopMenuPageTitle.toString());
        CustomListeners.test.log(Status.PASS,"Verify page navigation of gift cards top menu");
        return getTextFromElement(giftsCardsTopMenuPageTitle);
    }


    public void clickOnDesktopLinkInComputersTopMenuDropdown(){
        Reporter.log("Click on Desktop Link In Computers Top menu" + desktopDropDownLinkOfComputers.toString());
        clickOnElement(desktopDropDownLinkOfComputers);
        CustomListeners.test.log(Status.PASS,"Click on Desktop Link In Computers Top menu");
    }

    public void mouseHoverOnElectronicsTopMenuTab(){
        Reporter.log("Mouse hover on Electronics top menu" + electronicsTopMenuTab.toString());
        mouseHoverToElement(electronicsTopMenuTab);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Electronics top menu");

    }

    public void mouseHoverAndClickOnCellPhonesOptionInElectronics(){
        Reporter.log("Mouse hover and click on cell phones option in Electronics top menu" + cellPhonesLink.toString());
        mouseHoverToElementAndClick(cellPhonesLink);
        CustomListeners.test.log(Status.PASS,"Mouse hover and click on cell phones option in Electronics top menu");
    }

}
