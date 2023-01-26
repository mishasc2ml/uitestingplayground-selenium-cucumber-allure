package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.HiddenLayersPage;
import org.testng.Assert;

public class HiddenLayersSteps extends BaseStep {

    private final HiddenLayersPage hiddenLayersPage = new HiddenLayersPage(DriverUtil.getDriver());

    @Given("hidden layer page opened")
    public void hiddenLayerPageOpened() {
        homePage.openHiddenLayersPage();
    }

    @When("user clicks green button")
    public void userClicksGreenButton() {
        hiddenLayersPage.greenButtonClick();
    }

    @Then("button should not be clickable")
    public void isGreenButtonClickable() {
        Assert.assertFalse(hiddenLayersPage.isGreenButtonClickable());
    }
}
