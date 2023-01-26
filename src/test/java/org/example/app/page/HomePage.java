package org.example.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "http://uitestingplayground.com/";

    @FindBy(partialLinkText = "Dynamic ID")
    private WebElement dynamicIdPage;

    @FindBy(partialLinkText = "Class Attribute")
    private WebElement classAttributePage;

    @FindBy(partialLinkText = "Hidden Layers")
    private WebElement hiddenLayersPage;

    @FindBy(partialLinkText = "Load Delay")
    private WebElement loadDelayPage;

    @FindBy(partialLinkText = "AJAX Data")
    private WebElement ajaxDataPage;

    @FindBy(partialLinkText = "Client Side Delay")
    private WebElement clientSideDelayPage;

    @FindBy(partialLinkText = "Click")
    private WebElement clickPage;

    @FindBy(partialLinkText = "Text Input")
    private WebElement textInputPage;

    @FindBy(partialLinkText = "Scrollbars")
    private WebElement scrollBarsPage;

    @FindBy(partialLinkText = "Dynamic Table")
    private WebElement dynamicTablePage;

    @FindBy(partialLinkText = "Progress Bar")
    private WebElement progressBarPage;

    @FindBy(partialLinkText = "Visibility")
    private WebElement visibilityPage;

    @FindBy(partialLinkText = "Sample App")
    private WebElement sampleAppPage;

    @FindBy(partialLinkText = "Mouse Over")
    private WebElement mouseOverPage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public DynamicIdPage openDynamicIdPage() {
        wait.waitUntilClickableAndClick(dynamicIdPage);
        return new DynamicIdPage(driver);
    }

    public ClassAttributePage openClassAttributePage() {
        wait.waitUntilClickableAndClick(classAttributePage);
        return new ClassAttributePage(driver);
    }

    public HiddenLayersPage openHiddenLayersPage() {
        wait.waitUntilClickableAndClick(hiddenLayersPage);
        return new HiddenLayersPage(driver);
    }

    public LoadDelayPage openLoadDelayPage() {
        wait.waitUntilClickableAndClick(loadDelayPage);
        return new LoadDelayPage(driver);
    }

    public AjaxDataPage openAjaxDataPage() {
        wait.waitUntilClickableAndClick(ajaxDataPage);
        return new AjaxDataPage(driver);
    }

    public ClientSideDelayPage openClientSideDelayPage() {
        wait.waitUntilClickableAndClick(clientSideDelayPage);
        return new ClientSideDelayPage(driver);
    }

    public ClickPage openClickPage() {
        wait.waitUntilClickableAndClick(clickPage);
        return new ClickPage(driver);
    }

    public TextInputPage openTextInputPage() {
        wait.waitUntilClickableAndClick(textInputPage);
        return new TextInputPage(driver);
    }

    public ScrollBarsPage openScrollBarsPage() {
        wait.waitUntilClickableAndClick(scrollBarsPage);
        return new ScrollBarsPage(driver);
    }

    public DynamicTablePage openDynamicTablePage() {
        wait.waitUntilClickableAndClick(dynamicTablePage);
        return new DynamicTablePage(driver);
    }

    public ProgressBarPage openProgressBarPage() {
        wait.waitUntilClickableAndClick(progressBarPage);
        return new ProgressBarPage(driver);
    }

    public VisibilityPage openVisibilityPage() {
        wait.waitUntilClickableAndClick(visibilityPage);
        return new VisibilityPage(driver);
    }

    public SampleAppPage openSampleAppPage() {
        wait.waitUntilClickableAndClick(sampleAppPage);
        return new SampleAppPage(driver);
    }

    public MouseOverPage openMouseOverPage() {
        wait.waitUntilClickableAndClick(mouseOverPage);
        return new MouseOverPage(driver);
    }
}
