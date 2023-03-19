package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CheckoutCompletePage extends BasePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    private final By completeText = By.xpath("//h2");

    public String getCompleteMessage() {
        return driver.findElement(completeText).getText();
    }
}
