package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.AjaxDataPage;
import org.testng.Assert;

public class AjaxDataSteps extends BaseStep {

    private final AjaxDataPage ajaxDataPage = new AjaxDataPage(DriverUtil.getDriver());

    @Given("ajax data exercise page opened")
    public void ajaxDataExerciseOpenPage() {
        homePage.openAjaxDataPage();
    }

    @When("user clicks button triggering ajax request")
    public void buttonTriggeringAjaxRequestClick() {
        ajaxDataPage.ajaxButtonClick();
    }

    @Then("data loaded with ajax get request appears")
    public void isDataAppeared() {
        Assert.assertTrue(ajaxDataPage.isAjaxDataLoaded());
    }
}
