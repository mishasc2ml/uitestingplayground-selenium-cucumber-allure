package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.ClickPage;
import org.testng.Assert;

public class ClickSteps extends BaseStep {

    private final ClickPage clickPage = new ClickPage(DriverUtil.getDriver());

    @Given("click exercise page opened")
    public void clickExerciseOpenPage() {
        homePage.openClickPage();
    }

    @When("user clicks blue button that ignores DOM event")
    public void blueButtonIgnoringDomEventClick() {
        clickPage.blueButtonClick();
    }

    @Then("button becomes green")
    public void isButtonBecomeGreen() {
        Assert.assertTrue(clickPage.isBlueButtonClicked());
    }
}
