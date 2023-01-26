package org.example.app.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.ProgressBarPage;
import org.testng.Assert;

public class ProgressBarSteps extends BaseStep {

    private final ProgressBarPage progressBarPage = new ProgressBarPage(DriverUtil.getDriver());

    @Given("progress bar exercise page opened")
    public void progressBarPageOpened() {
        homePage.openProgressBarPage();
    }

    @When("user clicks start button")
    public void startButtonClick() {
        progressBarPage.startButtonClick();
    }

    @And("user clicks stop button when progress bar reaches {int}%")
    public void stopButtonClick(int progressBarValue) {
        progressBarPage.stopButtonClick();
    }

    @Then("result should be less than {int}")
    public void isResultLessThanFive(int resValue) {
        Assert.assertTrue(progressBarPage.isResultLessThanFive());
    }
}
