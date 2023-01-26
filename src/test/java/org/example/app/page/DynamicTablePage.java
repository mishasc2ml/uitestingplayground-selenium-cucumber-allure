package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicTablePage extends BasePage {

    @FindBy(xpath = "//div[@role = 'row']//span[contains(text(), 'Chrome')]/following-sibling::span[contains(text(), '%')]")
    private WebElement chromeCpuElement;

    @FindBy(xpath = "//p[@class = 'bg-warning']")
    private WebElement yellowLabelCpuElement;

    public DynamicTablePage(WebDriver driver) {
        super(driver);
    }

    public String getChromeCpuValueFromTable() {
        logger.info("got table CPU value");
        return wait.waitUntilVisible(chromeCpuElement).getText();
    }

    public String getChromeCpuValueFromYellowLabel() {
        wait.waitUntilVisible(yellowLabelCpuElement);
        int yellowLabelTextLength = yellowLabelCpuElement.getText().length();
        logger.info("got yellow label CPU value");
        return yellowLabelCpuElement.getText().substring(yellowLabelTextLength - 4);
    }
}
