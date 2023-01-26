package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClassAttributePage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    private WebElement blueButton;

    public ClassAttributePage(WebDriver driver) {
        super(driver);
    }

    public ClassAttributePage blueButtonCLick() {
        wait.waitUntilClickableAndClick(blueButton);
        return this;
    }

    public String getAlertText() {
        new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_IN_SECONDS)).until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public ClassAttributePage closeAlert() {
        driver.switchTo().alert().accept();
        return this;
    }
}
