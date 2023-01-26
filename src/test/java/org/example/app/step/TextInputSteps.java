package org.example.app.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.driver.DriverUtil;
import org.example.app.page.TextInputPage;
import org.testng.Assert;

public class TextInputSteps extends BaseStep {

    private final TextInputPage textInputPage = new TextInputPage(DriverUtil.getDriver());

    @Given("text input exercise page opened")
    public void textInputPageOpened() {
        homePage.openTextInputPage();
    }

    @When("user sets new button name")
    public void inputNewButtonName() {
        textInputPage.inputNewButtonName();
    }

    @And("user clicks changing name button")
    public void nameChangingButtonClick() {
        textInputPage.setNewNameButtonClick();
    }

    @Then("button name changes")
    public void isButtonNameChanged() {
        Assert.assertEquals(textInputPage.getButtonName(), "New button name");
    }
}
