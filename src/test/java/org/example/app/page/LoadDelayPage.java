package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadDelayPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(), 'Button Appearing After Delay')]")
    private WebElement buttonAppearingAfterDelay;

    public LoadDelayPage(WebDriver driver) {
        super(driver);
    }

    public boolean isButtonAppearingAfterLoadDelayClicked() {
        try {
            wait.waitUntilClickableAndClick(buttonAppearingAfterDelay);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
