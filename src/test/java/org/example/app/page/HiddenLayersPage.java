package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenLayersPage extends BasePage {

    @FindBy(id = "greenButton")
    private WebElement greenButton;

    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    public HiddenLayersPage greenButtonClick() {
        wait.waitUntilClickableAndClick(greenButton);
        return this;
    }

    public boolean isGreenButtonClickable() {
        try {
            wait.waitUntilClickableAndClick(greenButton);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
