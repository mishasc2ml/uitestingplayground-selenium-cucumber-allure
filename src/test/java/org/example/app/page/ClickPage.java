package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickPage extends BasePage {

    @FindBy(xpath = "//button[contains(@class,'btn-primary')]")
    private WebElement blueButton;


    public ClickPage(WebDriver driver) {
        super(driver);
    }

    public ClickPage blueButtonClick() {
        actions.moveToElement(blueButton).click().perform();
        logger.info("blue button has been clicked");
        return this;
    }

    public boolean isBlueButtonClicked() {
        try {
            actions.moveToElement(blueButton).click().perform();
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}
