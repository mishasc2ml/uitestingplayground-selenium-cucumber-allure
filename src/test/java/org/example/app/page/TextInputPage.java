package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextInputPage extends BasePage {

    @FindBy(id = "newButtonName")
    private WebElement nameInputField;

    @FindBy(id = "updatingButton")
    private WebElement changingNameButton;

    public TextInputPage(WebDriver driver) {
        super(driver);
    }

    public TextInputPage inputNewButtonName() {
        wait.waitUntilVisible(nameInputField).sendKeys("New button name");
        return this;
    }

    public TextInputPage setNewNameButtonClick() {
        wait.waitUntilClickableAndClick(changingNameButton);
        return this;
    }

    public String getButtonName() {
        return wait.waitUntilVisible(changingNameButton).getText();
    }
}
