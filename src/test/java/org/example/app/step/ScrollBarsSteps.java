package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.ScrollBarsPage;
import org.testng.Assert;

public class ScrollBarsSteps extends BaseStep {

    private final ScrollBarsPage scrollBarsPage = new ScrollBarsPage(DriverUtil.getDriver());

    @Given("scroll bars exercise page opened")
    public void scrollBarsPageOpened() {
        homePage.openScrollBarsPage();
    }

    @When("user finds a hidden button")
    public void findHiddenButton() {
        scrollBarsPage.findHiddenButton();
    }

    @Then("user clicks hidden button")
    public void isHiddenButtonClickable() {
        Assert.assertTrue(scrollBarsPage.isHiddenButtonClickable());
    }
}
