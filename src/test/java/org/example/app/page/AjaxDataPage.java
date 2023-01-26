package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AjaxDataPage extends BasePage {

    @FindBy(id = "ajaxButton")
    private WebElement ajaxButton;

    @FindBy(xpath = "//p[@class='bg-success']")
    private WebElement loadedDataElement;

    public AjaxDataPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public AjaxDataPage ajaxButtonClick() {
        wait.waitUntilClickableAndClick(ajaxButton);
        return this;
    }

    public boolean isAjaxDataLoaded() {
        try {
            wait.waitUntilVisible(loadedDataElement);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
