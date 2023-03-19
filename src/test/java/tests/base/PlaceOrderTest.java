package tests.base;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest{

    private final String LOGIN = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String TEST_VALUE = "test";
    private final String COMPLETE_ORDER_URL = "https://www.saucedemo.com/checkout-complete.html";
    private final String COMPLETE_ORDER_MESSAGE = "THANK YOU FOR YOUR ORDER";

    @Test
    @Description("Place order and check success message")
    public void placeOrder() {
        loginPage
                .open()
                .fillLogin(LOGIN)
                .fillPassword(PASSWORD)
                .clickLoginButton();
        catalogPage
                .addFirstProductToCart()
                .clickBasketIcon();
        cartPage
                .clickCheckoutButton();
        checkoutInfoPage
                .addFirstName(TEST_VALUE)
                .addLastName(TEST_VALUE)
                .addPostalCode(TEST_VALUE)
                .clickContinueButton();
        overviewPage
                .clickFinishButton();

        Assert.assertEquals(driver.getCurrentUrl(), COMPLETE_ORDER_URL);

        Assert.assertEquals(checkoutCompletePage.getCompleteMessage(), COMPLETE_ORDER_MESSAGE);
    }
}
