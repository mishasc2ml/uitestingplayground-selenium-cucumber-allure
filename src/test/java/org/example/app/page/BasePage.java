package org.example.app.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.example.app.util.Waiting;

public abstract class BasePage {

    protected WebDriver driver;
    protected Waiting wait;
    protected Actions actions;
    protected Logger logger;
    public static final int TIME_OUT_IN_SECONDS = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new Waiting(driver, TIME_OUT_IN_SECONDS);
        actions = new Actions(driver);
        logger = LogManager.getRootLogger();
        PageFactory.initElements(this.driver, this);
    }
}
