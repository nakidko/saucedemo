package tests.base;

import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.base.BasePage;
import pages.saucedemo.*;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected CatalogPage catalogPage = new CatalogPage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);
    protected OverviewPage overviewPage = new OverviewPage(driver);
    protected CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

    @AfterMethod(alwaysRun = true)
    void clearCookiesAndLocalStorage() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        jsExecutor.executeScript("window.sessionStorage.clear()");
    }

    @AfterClass(alwaysRun = true)
    void quit() {
        driver.quit();
    }
}
