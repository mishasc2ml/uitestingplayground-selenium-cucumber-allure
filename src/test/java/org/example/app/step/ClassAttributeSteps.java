package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.ClassAttributePage;
import org.testng.Assert;

public class ClassAttributeSteps extends BaseStep {

    private final ClassAttributePage classAttributePage = new ClassAttributePage(DriverUtil.getDriver());

    @Given("class attribute exercise page opened")
    public void classAttributeExerciseOpenPage() {
        homePage.openClassAttributePage();
    }

    @When("user clicks blue button")
    public void blueButtonClick() {
        classAttributePage.blueButtonCLick();

    }

    @Then("alert containing text {string} appears")
    public void isAlertPresent(String alertText) {
        Assert.assertEquals(classAttributePage.getAlertText(), alertText);
        classAttributePage.closeAlert();
    }


}
