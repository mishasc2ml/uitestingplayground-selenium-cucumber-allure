package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPage extends BasePage {

    @FindBy(id = "startButton")
    private WebElement startButton;

    @FindBy(id = "stopButton")
    private WebElement stopButton;

    @FindBy(id = "result")
    private WebElement resultElement;

    @FindBy(id = "progressBar")
    private WebElement progressBarElement;

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    public ProgressBarPage startButtonClick() {
        wait.waitUntilClickableAndClick(startButton);
        logger.info("start button has been clicked");
        return this;
    }

    public ProgressBarPage stopButtonClick() {
        int progressbarValueLength = progressBarElement.getText().length();
        boolean flag = true;
        while (flag) {
            if (Integer.parseInt(progressBarElement.getText().substring(0, progressbarValueLength - 1)) >= 75) {
                stopButton.click();
                flag = false;
            }
        }
        logger.info("stop button has been clicked");
        return this;
    }

    private String getResultValue() {
        wait.waitUntilVisible(progressBarElement);
        int spaceIndex = resultElement.getText().indexOf(" ");
        int commaIndex = resultElement.getText().indexOf(",");
        logger.info("got result value");
        return resultElement.getText().substring(spaceIndex + 1, commaIndex);
    }

    public boolean isResultLessThanFive() {
        return Integer.parseInt(getResultValue()) < 5;
    }
}
