package org.example.app.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.app.driver.DriverUtil;
import org.example.app.page.DynamicTablePage;
import org.testng.Assert;

public class DynamicTableSteps extends BaseStep {

    private final DynamicTablePage dynamicTablePage = new DynamicTablePage(DriverUtil.getDriver());


    @Given("dynamic table exercise page opened")
    public void dynamicTableExerciseOpenPage() {
        homePage.openDynamicTablePage();
    }

    @Then("value from the table equals value from the yellow bar")
    public void isCpuValueFromTheTableEqualsValueFromTheLabel() {
        Assert.assertEquals(dynamicTablePage.getChromeCpuValueFromTable()
                , dynamicTablePage.getChromeCpuValueFromYellowLabel());
    }
}
