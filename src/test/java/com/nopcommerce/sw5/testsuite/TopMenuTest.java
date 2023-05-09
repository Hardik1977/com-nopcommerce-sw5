package com.nopcommerce.sw5.testsuite;

import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.pages.HomePage;
import com.nopcommerce.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }


    @Test(groups = {"sanity", "regression"})
    public void verifyTextOfComputerTopMenuTabSuccessfully() {

        homePage.selectAllTopMenuTabs("Computers");
        Assert.assertEquals(homePage.verifyPaveNavigationOfComputerTopMenuTab(), "Computers");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyPageNavigationOfElectronicsTopMenuTabSuccessfully() {

        homePage.selectAllTopMenuTabs("Electronics");
        Assert.assertEquals(homePage.verifyPaveNavigationOfElectronicsTopMenuTab(), "Electronics");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfApparelTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Apparel");
        Assert.assertEquals(homePage.verifyPaveNavigationOfApparelTopMenuTab(), "Apparel");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfDigitalDownloadsTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Digital downloads");
        Assert.assertEquals(homePage.verifyPaveNavigationOfDigitalDownloadsTopMenuTab(), "Digital downloads");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfBooksTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Books");
        Assert.assertEquals(homePage.verifyPaveNavigationOfBooksTopMenuTab(), "Books");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfJewelryTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Jewelry");
        Assert.assertEquals(homePage.verifyPaveNavigationOfJewelryTopMenuTab(), "Jewelry");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfGiftCardsTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Gift cards");
        Assert.assertEquals(homePage.verifyPaveNavigationOfGiftCardsTopMenuTab(), "Gift Cards");
    }

}
