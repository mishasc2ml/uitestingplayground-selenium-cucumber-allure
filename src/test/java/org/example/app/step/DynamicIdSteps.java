package org.example.app.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.DynamicIdPage;
import org.testng.Assert;

public class DynamicIdSteps extends BaseStep {

    private final DynamicIdPage dynamicIdPage = new DynamicIdPage(DriverUtil.getDriver());

    @Given("dynamic id exercise page opened")
    public void dynamicIdExerciseOpenPage() {
        homePage.openDynamicIdPage();
    }

    @When("user clicks dynamic id  button")
    public void dynamicIdButtonClick() {
        dynamicIdPage.buttonClick();
    }

    @And("user refreshes the page")
    public void refreshPage() {
        DriverUtil.getDriver().navigate().refresh();
    }

    @Then("button should be clickable")
    public void isButtonClickable() {
        Assert.assertTrue(dynamicIdPage.isButtonClicked());
    }


}
