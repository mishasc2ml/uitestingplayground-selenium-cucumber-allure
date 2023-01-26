package org.example.app.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiting {

    private WebDriverWait wait;

    public Waiting(WebDriver driver, int timeOut) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    }

    public void waitUntilClickableAndClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public WebElement waitUntilVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}