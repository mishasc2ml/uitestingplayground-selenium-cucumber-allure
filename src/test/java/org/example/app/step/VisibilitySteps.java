package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.VisibilityPage;
import org.testng.asserts.SoftAssert;

public class VisibilitySteps extends BaseStep {

    private final VisibilityPage visibilityPage = new VisibilityPage(DriverUtil.getDriver());

    @Given("visibility exercise page opened")
    public void visibilityPageOpened() {
        homePage.openVisibilityPage();
    }

    @When("user clicks hide button")
    public void hideButtonClick() {
        visibilityPage.hideButtonClick();
    }

    @Then("other buttons should not be visible")
    public void buttonsVisibilityTests() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(visibilityPage.isInvisibleButtonVisible());
        softAssert.assertFalse(visibilityPage.isRemovedButtonVisible());
        softAssert.assertFalse(visibilityPage.isTransparentButtonVisible());
        softAssert.assertFalse(visibilityPage.isNotDisplayedButtonVisible());
        softAssert.assertFalse(visibilityPage.isOffScreenButtonVisible());
        softAssert.assertFalse(visibilityPage.isZeroWidthButtonVisible());
        softAssert.assertTrue(visibilityPage.isOverLappedButtonVisible());
        softAssert.assertAll();
    }
}
