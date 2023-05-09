package com.nopcommerce.sw5.testsuite;

import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.pages.*;
import com.nopcommerce.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
@Listeners(CustomListeners.class)
public class TestSuite extends BaseTest {

    HomePage homePage;
    CellPhonesPage cellPhonesPage;
    CheckoutPage checkoutPage;
    ConfirmOrderPage confirmOrderPage;
    LogInPage logInPage;
    PaymentMethodPage paymentMethodPage;
    PaymentInformationPage paymentInformationPage;
    ProductPage productPage;
    RegisterPage registerPage;
    ShippingMethodPage shippingMethodPage;
    ShoppingCartPage shoppingCartPage;
    SignInPage signInPage;
    DeskTopsPage deskTopsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        cellPhonesPage = new CellPhonesPage();
        checkoutPage = new CheckoutPage();
        confirmOrderPage = new ConfirmOrderPage();
        logInPage = new LogInPage();
        paymentMethodPage = new PaymentMethodPage();
        paymentInformationPage = new PaymentInformationPage();
        productPage = new ProductPage();
        registerPage = new RegisterPage();
        shippingMethodPage = new ShippingMethodPage();
        shoppingCartPage = new ShoppingCartPage();
        signInPage = new SignInPage();
        deskTopsPage = new DeskTopsPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputersTopMenu();

        //1.2 Click on Desktop
        homePage.clickOnDesktopLinkInComputersTopMenuDropdown();

        //1.3 Select Sort By position "Name: Z to A"
        //1.4 Verify the Product will arrange in Descending order.
        ArrayList<String> originalProductsName = deskTopsPage.getProductNameList();
        //Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println("Reverse product name List:" + originalProductsName);
        // Select sort by Name Z - A
        Thread.sleep(2000);
        deskTopsPage.selectSortByOption("Name: Z to A");
        // After filter Z -A Get all the products name and stored into array list
        Thread.sleep(3000);
        ArrayList<String> afterSortByZToAProductsName = deskTopsPage.getProductNameList();
        System.out.println("After sorting list" + afterSortByZToAProductsName);
        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName, "Product not sorted into Z to A order");
    }

    @Test(groups = {"smoke","regression"})
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        homePage.clickOnComputersTopMenu();

        //2.2 Click on Desktop
        homePage.clickOnDesktopLinkInComputersTopMenuDropdown();

        //2.3 Select Sort By position "Name: A to Z"
        deskTopsPage.selectSortByName("Name: A to Z");

        Thread.sleep(2000);
        //2.4 Add to Cart
        deskTopsPage.addBuildYourOwnComputerProductInCart();

        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(productPage.verifyTitleOfBuildYourOwnComputerProduct(),"Build your own computer");

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPage.selectProcessorsOfBuildYourOwnComputer("2.2 GHz Intel Pentium Dual-Core E2200");

        //2.7.Select "8GB [+$60.00]" using Select class.
        productPage.selectRamOfBuildYourOwnComputer("8GB [+$60.00]");

        // 2.8 Select HDD radio "400 GB [+$100.00]"
        productPage.clickOnHddOfBuildYourOwnComputer();

        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        productPage.clickOnOsOfBuildYourOwnComputer();

        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        Thread.sleep(2000);
        productPage.clickOnSoftwareOfBuildYourOwnComputer();

        //2.11 Verify the price "$1,475.00"
        Assert.assertEquals( productPage.verifyPriceOfBuildYourOwnComputer(),"$1,470.00");

        //2.12 Click on "ADD TO CARD" Button.
        productPage.clickOnAddToCartAfterFiltersAdded();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(productPage.verifyMessageOfProductAddedToCart(),"The product has been added to your shopping cart");
        productPage.clickOnCloseBarToCloseMessage();

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPage.mouseHoverOnShoppingCartLink();
        Thread.sleep(1000);
        productPage.mouseHoverAndClickOnGoToCartButton();

        // 2.15 Verify the message "Shopping cart"
        Assert.assertEquals( shoppingCartPage.verifyTitleOfShoppingCartPage(),"Shopping cart");

        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeTheQty("2");
        shoppingCartPage.clickOnUpdateShoppingCartButton();

        //  2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.verifyTotalPriceOfProduct(),"$2,950.00");

        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();

        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.verifyTitleOfSignPage(),"Welcome, Please Sign In!");

        //2.21Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckoutAsGuestButton();

        // 2.22 Fill the all mandatory field
        checkoutPage.enterFirstName("Karuni");
        checkoutPage.enterLastName("Jagani");
        checkoutPage.enterEmail("karuni28jagani@gmail.com");
        checkoutPage.selectCountryFromCountryField("India");
        checkoutPage.enterCity("Ahmedabad");
        checkoutPage.enterAddress("13, Jagani soc");
        checkoutPage.enterPostalCode("393008");
        checkoutPage.enterNumber("07898678798");

        //2.23 Click on “CONTINUE”
        Thread.sleep(1000);
        checkoutPage.clickOnContinueButtonToShippingMethod();

        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        shippingMethodPage.clickOnNextDayAirShippingMethod();

        //2.25 Click on “CONTINUE”
        shippingMethodPage.clickOnContinueForPaymentMethod();

        //2.26 Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCardRadioButton();

        //2.27 Select “Master card” From Select credit card dropdown
        paymentMethodPage.clickOnContinueButtonToPaymentInformation();

        //2.28 Fill all the details
        paymentInformationPage.selectCreditCardType("Master card");
        paymentInformationPage.enterCardHolderName("Miss Karuna Jagani");
        paymentInformationPage.enterCardNumber("5425233430109903");
        paymentInformationPage.selectExpiryMonth("04");
        paymentInformationPage.selectExpiryYear("2026");
        paymentInformationPage.enterCardCode("676");

        //2.29 Click on “CONTINUE”
        paymentInformationPage.clickOnContinueToConfirmOrder();

        // 2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals( confirmOrderPage.verifyPaymentMethodName(),"Credit Card");

        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals( confirmOrderPage.verifyShippingMethodName(),"Shipping Method: Next Day Air");

        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(confirmOrderPage.verifyTotalPrice(),"$2,950.00");

        //2.34 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirmButton();

        //2.35 Verify the Text “Thank You”
        Assert.assertEquals( confirmOrderPage.verifyGreetingMessage(), "Thank you");

        // 2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(confirmOrderPage.verifyOrderSuccessMessage(),"Your order has been successfully processed!");

        // 2.37 Click on “CONTINUE”
        confirmOrderPage.clickOnContinueToStorePage();

        // 2.37 Verify the text “Welcome to our store”
        logInPage.verifyTitleOfLoginPage();

    }


}
