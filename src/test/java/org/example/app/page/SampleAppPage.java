package org.example.app.page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppPage extends BasePage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement userNameInputField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//button[contains(text(), 'Log In')]")
    private WebElement loginButton;

    @FindBy(xpath = "//button[contains(text(), 'Log Out')]")
    private WebElement logoutButton;

    public SampleAppPage(WebDriver driver) {
        super(driver);
    }

    public SampleAppPage fillTheForm(String username, String password) {
        wait.waitUntilVisible(userNameInputField).sendKeys(username);
        wait.waitUntilVisible(passwordInputField).sendKeys(password);
        return this;
    }

    public SampleAppPage submitButtonClick() {
        wait.waitUntilClickableAndClick(loginButton);
        logger.info("login button has been clicked");
        return this;
    }


    public boolean isLoginSuccessful() {
        try {
            wait.waitUntilVisible(logoutButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public SampleAppPage logout() {
        wait.waitUntilClickableAndClick(logoutButton);
        logger.info("logout button has been clicked");
        return this;
    }

    public boolean isLogoutSuccessful() {
        try {
            wait.waitUntilVisible(loginButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
