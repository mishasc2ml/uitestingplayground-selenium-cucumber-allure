package org.example.app.step;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.example.app.driver.DriverUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            Allure.getLifecycle().addAttachment("screenshot ", "image/png", "png"
                    , ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES));
        }
        DriverUtil.quitDriver();
    }
}
