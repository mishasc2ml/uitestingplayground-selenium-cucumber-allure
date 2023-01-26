package org.example.app.step;

import org.example.app.driver.DriverUtil;
import org.example.app.page.HomePage;

public abstract class BaseStep {

    protected HomePage homePage = new HomePage(DriverUtil.getDriver());

    public BaseStep() {
        homePage.openHomePage();
    }
}
