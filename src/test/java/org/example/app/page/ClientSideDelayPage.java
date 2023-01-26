package org.example.app.page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ClientSideDelayPage extends BasePage {

    @FindBy(id = "ajaxButton")
    private WebElement ajaxButton;

    @FindBy(xpath = "//p[@class='bg-success']")
    private WebElement loadedDataElement;

    public ClientSideDelayPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public ClientSideDelayPage ajaxButtonClick() {
        wait.waitUntilClickableAndClick(ajaxButton);
        logger.info("ajax button has been clicked");
        return this;
    }

    public boolean isDataCalculatedOnTheServerSide() {
        try {
            wait.waitUntilVisible(loadedDataElement);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
