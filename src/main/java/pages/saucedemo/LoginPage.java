package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://www.saucedemo.com/";
    private final By loginField = By.id("user-name");
    private final By passwordField = By.xpath("//input[@id='password']");
    private final By loginButton = By.cssSelector(".submit-button");
    private final By infoPanel = By.xpath("//h3");


    public LoginPage open() {
        driver.get(url);

        return this;
    }

    public LoginPage fillLogin(String login) {
        driver.findElement(loginField).sendKeys(login);

        return this;
    }

    public LoginPage fillPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);

        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(loginButton).click();

        return this;
    }

    public String getErrorMessage() {
        return driver.findElement(infoPanel).getText();
    }
}
