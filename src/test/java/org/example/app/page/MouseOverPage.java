package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends BasePage {

    @FindBy(xpath = "//a[@title='Click me']")
    private WebElement clickMeLink;

    @FindBy(id = "clickCount")
    private WebElement clickCounterElement;

    public MouseOverPage(WebDriver driver) {
        super(driver);
    }

    public MouseOverPage clickLinkTwoTimes() {
        actions.moveToElement(clickMeLink).click().click().perform();
        return this;
    }

    public int clicksCounterValue() {
        return Integer.parseInt(clickCounterElement.getText());
    }
}
