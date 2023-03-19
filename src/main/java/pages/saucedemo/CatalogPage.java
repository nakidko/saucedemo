package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CatalogPage extends BasePage {
    private final By products = By.cssSelector(".btn_primary");
    private final By basketIcon = By.xpath("//a[@class='shopping_cart_link']");

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public CatalogPage addFirstProductToCart() {
        driver.findElements(products).get(0).click();

        return this;
    }

    public CatalogPage clickBasketIcon() {
        driver.findElement(basketIcon).click();

        return this;
    }
}
