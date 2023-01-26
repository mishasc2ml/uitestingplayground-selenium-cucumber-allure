package org.example.app.step;

import io.cucumber.java.After;
import org.example.app.driver.DriverUtil;

public class Hooks {

    @After
    public void closeDriver() {
        DriverUtil.quitDriver();
    }
}
