package tests.base;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest{
    private final String TEST_VALUE = "test";
    private final String FAILED_AUTHORIZATION_MESSAGE =
            "Epic sadface: Username and password do not match any user in this service";

    @Test
    @Description("Log in with incorrect authorization data, check Error message")
    public void loginByUnregisteredUserData() {
        loginPage
                .open()
                .fillLogin(TEST_VALUE)
                .fillPassword(TEST_VALUE)
                .clickLoginButton();

        Assert.assertEquals(FAILED_AUTHORIZATION_MESSAGE, loginPage.getErrorMessage());
    }
}
