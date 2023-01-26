package org.example.app.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.SampleAppPage;
import org.testng.Assert;

public class SampleAppSteps extends BaseStep {

    private final SampleAppPage sampleAppPage = new SampleAppPage(DriverUtil.getDriver());

    @Given("sample app exercise page opened")
    public void ajaxDataExerciseOpenPage() {
        homePage.openSampleAppPage();
    }

    @When("user fills the form")
    public void fillTheForm() {
        sampleAppPage.fillTheForm("test", "pwd");
    }

    @And("user submits the form")
    public void login() {
        sampleAppPage.submitButtonClick();
    }

    @Then("logout button appears")
    public void isLoginSuccessful() {
        Assert.assertTrue(sampleAppPage.isLoginSuccessful());
    }

    @And("user did login")
    public void doLogin() {
        sampleAppPage.fillTheForm("test", "pwd").submitButtonClick();
    }

    @When("user clicks logout button")
    public void logout() {
        sampleAppPage.logout();
    }

    @Then("login button appears")
    public void isLogoutSuccessful() {
        Assert.assertTrue(sampleAppPage.isLogoutSuccessful());
    }
}
