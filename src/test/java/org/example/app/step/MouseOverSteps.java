package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.MouseOverPage;
import org.testng.Assert;

public class MouseOverSteps extends BaseStep {

    private final MouseOverPage mouseOverPage = new MouseOverPage(DriverUtil.getDriver());

    @Given("mouse over exercise page opened")
    public void mouseOverPageOpened() {
        homePage.openMouseOverPage();
    }

    @When("user clicks link two times")
    public void linkClick() {
        mouseOverPage.clickLinkTwoTimes();
    }

    @Then("click counter should be equal {int}")
    public void clickCounterShouldBeEqual(int expectedClicksNumber) {
        Assert.assertEquals(mouseOverPage.clicksCounterValue(), expectedClicksNumber);
    }
}
