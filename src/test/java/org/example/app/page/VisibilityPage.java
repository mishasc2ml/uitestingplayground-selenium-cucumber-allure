package org.example.app.page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisibilityPage extends BasePage {

    @FindBy(id = "hideButton")
    private WebElement hideButton;

    @FindBy(id = "removedButton")
    private WebElement removedButton;

    @FindBy(id = "zeroWidthButton")
    private WebElement zeroWidthButton;

    @FindBy(id = "overlappedButton")
    private WebElement overLappedButton;

    @FindBy(id = "transparentButton")
    private WebElement transparentButton;

    @FindBy(id = "invisibleButton")
    private WebElement invisibleButton;

    @FindBy(id = "notdisplayedButton")
    private WebElement notDisplayedButton;

    @FindBy(id = "offscreenButton")
    private WebElement offScreenButton;

    public VisibilityPage(WebDriver driver) {
        super(driver);
    }

    public VisibilityPage hideButtonClick() {
        wait.waitUntilClickableAndClick(hideButton);
        return this;
    }

    public boolean isRemovedButtonVisible() {
        try {
            wait.waitUntilVisible(removedButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isZeroWidthButtonVisible() {
        try {
            wait.waitUntilVisible(zeroWidthButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isOverLappedButtonVisible() {
        try {
            wait.waitUntilVisible(overLappedButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isTransparentButtonVisible() {
        try {
            wait.waitUntilVisible(transparentButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isInvisibleButtonVisible() {
        try {
            wait.waitUntilVisible(invisibleButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isNotDisplayedButtonVisible() {
        try {
            wait.waitUntilVisible(notDisplayedButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isOffScreenButtonVisible() {
        try {
            wait.waitUntilVisible(offScreenButton);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
