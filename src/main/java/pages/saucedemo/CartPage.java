package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By returnButton = By.cssSelector(".back");
    private final By removeButton = By.xpath("//button[text()='Remove']");
    private final By checkoutButton = By.id("checkout");

    public CartPage returnToCatalogPage() {
        driver.findElement(returnButton).click();

        return this;
    }

    public CartPage removeItem() {
        driver.findElement(removeButton).click();

        return this;
    }

    public CartPage clickCheckoutButton() {
        driver.findElement(checkoutButton).click();

        return this;
    }
}
