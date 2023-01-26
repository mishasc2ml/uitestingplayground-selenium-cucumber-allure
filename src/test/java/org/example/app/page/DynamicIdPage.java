package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdPage extends BasePage {

    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(), 'Button with Dynamic ID')]")
    private WebElement dynamicIdButton;

    public DynamicIdPage buttonClick() {
        wait.waitUntilClickableAndClick(dynamicIdButton);
        return new DynamicIdPage(driver);
    }

    public boolean isButtonClicked() {
        try {
            wait.waitUntilClickableAndClick(dynamicIdButton);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
