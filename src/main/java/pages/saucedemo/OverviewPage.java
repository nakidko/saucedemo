package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    private final By cancelButton = By.cssSelector(".cart_cancel_link");
    private final By finishButton = By.xpath("//button[@data-test='finish']");

    public OverviewPage cancelOrdering() {
        driver.findElement(cancelButton).click();

        return this;
    }

    public OverviewPage clickFinishButton() {
        driver.findElement(finishButton).click();

        return this;
    }
}
