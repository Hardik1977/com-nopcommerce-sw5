package com.nopcommerce.sw5.testsuite;

import com.nopcommerce.sw5.customlisteners.CustomListeners;
import com.nopcommerce.sw5.pages.*;
import com.nopcommerce.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

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
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTopMenuTab();

        //1.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverAndClickOnCellPhonesOptionInElectronics();

        //1.3 Verify the text “Cell phones”
        Assert.assertEquals( "Cell phones",  cellPhonesPage.verifyCellPhonesText());
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // 2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTopMenuTab();

        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverAndClickOnCellPhonesOptionInElectronics();

        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.verifyCellPhonesText(),"Cell phones");

        //2.4 Click on List View Tab
        cellPhonesPage.clickOnListViewTab();

        Thread.sleep(2000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnNokiaLumiaCellPhone();

        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals( productPage.verifyNokiaLumia1020(),"Nokia Lumia 1020");

        //2.7 Verify the price “$349.00”
        Assert.assertEquals(productPage.verifyPriceOfNokiaLumia(),"$349.00");

        //2.8 Change quantity to 2
        productPage.changeTheQty("2");

        //2.9 Click on “ADD TO CART” tab
        productPage.addToCartNokiaLumiaCellPhone();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(productPage.verifyMessageOfProductAddedToCart(),"The product has been added to your shopping cart");
        //After that close the bar clicking on the cross button.
        productPage.clickOnCloseBarToCloseMessage();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPage.mouseHoverOnShoppingCartLink();

        //2.12 Verify the message "Shopping cart"
        Thread.sleep(1000);
        productPage.mouseHoverAndClickOnGoToCartButton();

        //2.13 Verify the quantity is 2
        Assert.assertEquals( shoppingCartPage.verifyTitleOfShoppingCartPage(),"Shopping cart");

        //2.14 Verify the Total $698.00
        Assert.assertEquals( shoppingCartPage.verifyTotalPriceOfProduct(),"$698.00");

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.verifyTitleOfSignPage(),"Welcome, Please Sign In!");

        //2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterTab();

        //2.19 Verify the text “Register”
        Assert.assertEquals(registerPage.verifyRegisterTitle(),"Register");

        //2.20 Fill the mandatory fields
        registerPage.enterFirstName("Karnisha" );
        registerPage.enterLastName("Agarwal");
        registerPage.enterEmail("karni" + getRandomString(2) +"29agarwal@gmail.com");
        registerPage.enterPassword("9081811670@Dv");
        registerPage.enterConfirmPassword("9081811670@Dv");

        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();

        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals( registerPage.verifyRegistrationMessage(),"Your registration completed");

        //Click on Log in link
        Thread.sleep(2000);
        registerPage.clickOnLoginLink();
        signInPage.enterEmail("karnishaagarwal@gmail.com");
        signInPage.enterPassword("908111670@Dv");
        signInPage.clickOnLoginButton();


        // 2.24 Verify the text “Shopping card”
        Thread.sleep(2000);
        Assert.assertEquals( shoppingCartPage.verifyTitleOfShoppingCartPage(),"Shopping cart");

        //2.25 click on checkbox “I agree with the terms of service”
        Thread.sleep(1000);
        shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();

        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();

        //2.27 Fill the Mandatory fields
        checkoutPage.enterFirstName("Karnisha");
        checkoutPage.enterLastName("Agarwal");
        checkoutPage.enterEmail("karnisha29agarwal@gmail.com");
        checkoutPage.selectCountryFromCountryField("India");
        checkoutPage.enterCity("Ahmedabad");
        checkoutPage.enterAddress("14, Jagani soc");
        checkoutPage.enterPostalCode("393008");
        checkoutPage.enterNumber("07898678749");

        //2.28 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonToShippingMethod();

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        shippingMethodPage.clickOnSecondDayAirShippingMethod();

        //2.30 Click on “CONTINUE”
        shippingMethodPage.clickOnContinueForPaymentMethod();

        //2.31 Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCardRadioButton();
        paymentMethodPage.clickOnContinueButtonToPaymentInformation();

        //2.32 Select “Visa” From Select credit card dropdown
        paymentInformationPage.selectCreditCardType("Visa");

        //2.33 Fill all the details
        paymentInformationPage.enterCardHolderName("Miss Karnisha Agarwal");
        paymentInformationPage.enterCardNumber("4263982640269299");
        paymentInformationPage.selectExpiryMonth("02");
        paymentInformationPage.selectExpiryYear("2026");
        paymentInformationPage.enterCardCode("837");

        //2.34 Click on “CONTINUE”
        paymentInformationPage.clickOnContinueToConfirmOrder();

        //2.35 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(confirmOrderPage.verifyPaymentMethodName(),"Credit Card");

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(confirmOrderPage.verifyShippingMethodName(),"2nd Day Air");

        //2.37 Verify Total is “$698.00”
        Assert.assertEquals("$698.00", confirmOrderPage.verifyTotalPrice());

        //2.38 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirmButton();

        //2.39 Verify the Text “Thank You”
        Assert.assertEquals(confirmOrderPage.verifyGreetingMessage(),"Thank you");

        //2.40 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(confirmOrderPage.verifyOrderSuccessMessage(),"Your order has been successfully processed!");

        //2.41 Click on “CONTINUE”
        confirmOrderPage.clickOnContinueToStorePage();

        //2.42 Verify the text “Welcome to our store”
        Assert.assertEquals(logInPage.verifyTitleOfLoginPage(),"Welcome to our store");

        //2.43 Click on “Logout” link
        logInPage.clickOnLogoutLink();

        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        Assert.assertEquals(getCurrentUrl(),"https://demo.nopcommerce.com/" );
    }

}
