package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.app.driver.DriverUtil;
import org.example.app.page.LoadDelayPage;
import org.testng.Assert;

public class LoadDelaySteps extends BaseStep {

    private final LoadDelayPage loadDelayPage = new LoadDelayPage(DriverUtil.getDriver());

    @Given("load delay exercise page opened")
    public void loadDelayPageOpened() {
        homePage.openLoadDelayPage();
    }

    @Then("user clicks button appearing after load delay")
    public void isButtonAppearingAfterLoadDelayClicked() {
        Assert.assertTrue(loadDelayPage.isButtonAppearingAfterLoadDelayAppeared());
    }
}
