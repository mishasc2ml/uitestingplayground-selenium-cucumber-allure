package org.example.app.page;

import org.example.app.util.Scripts;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollBarsPage extends BasePage {

    @FindBy(id = "hidingButton")
    private WebElement hiddenButton;

    public ScrollBarsPage(WebDriver driver) {
        super(driver);
    }

    public ScrollBarsPage findHiddenButton() {
        Scripts.moveToElement(driver, hiddenButton);
        logger.info("moved to hidden element");
        return this;
    }

    public boolean isHiddenButtonClickable() {
        try {
            wait.waitUntilClickableAndClick(hiddenButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
