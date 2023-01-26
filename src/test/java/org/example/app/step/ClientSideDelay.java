package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.ClientSideDelayPage;
import org.testng.Assert;

public class ClientSideDelay extends BaseStep {

    private final ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage(DriverUtil.getDriver());

    @Given("client side exercise page opened")
    public void clientSideDelayExerciseOpenPage() {
        homePage.openClientSideDelayPage();
    }

    @When("user clicks button triggering client side logic")
    public void buttonTriggeringClientSideLogicClick() {
        clientSideDelayPage.ajaxButtonClick();
    }

    @Then("data calculated on the client side")
    public void isDataAppeared() {
        Assert.assertTrue(clientSideDelayPage.isDataCalculatedOnTheServerSide());
    }
}
