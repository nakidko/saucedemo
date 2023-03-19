package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CheckoutInfoPage extends BasePage {
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameField = By.cssSelector("[name='firstName']");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.cssSelector("#postal-code");
    private final By continueButton = By.xpath("//input[@type='submit']");

    public CheckoutInfoPage addFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);

        return this;
    }

    public CheckoutInfoPage addLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);

        return this;
    }

    public CheckoutInfoPage addPostalCode(String postalCode) {
        driver.findElement(postalCodeField).sendKeys(postalCode);

        return this;
    }

    public CheckoutInfoPage clickContinueButton() {
        driver.findElement(continueButton).click();

        return this;
    }
}
