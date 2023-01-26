Feature: Completed exercises from http://uitestingplayground.com/

  @DynamicID
  Scenario: Dynamic id exercise - click dynamic id button, refresh page, click dynamic id button again
    Given dynamic id exercise page opened
    When user clicks dynamic id  button
    And user refreshes the page
    Then button should be clickable

  @ClassAttribute
  Scenario: Class attribute exercise - click blue button and press ok in alert popup
    Given class attribute exercise page opened
    When user clicks blue button
    Then alert containing text "Primary button pressed" appears

  @HiddenLayers
  Scenario: Hidden layers exercise - click button on hidden layer
    Given hidden layer page opened
    When user clicks green button
    Then button should not be clickable

  @LoadDelay
  Scenario: Load Delay exercise - click button after load delay
    Given load delay exercise page opened
    Then user clicks button appearing after load delay

  @AJAXData
  Scenario: AJAX data exercise - click ajax button and wait for data loaded and appear
    Given ajax data exercise page opened
    When user clicks button triggering ajax request
    Then data loaded with ajax get request appears

  @ClientSideDelay
  Scenario: Client side delay exercise - click button and wait for data loaded from client side logic and appear
    Given client side exercise page opened
    When user clicks button triggering client side logic
    Then data calculated on the client side

  @Click
  Scenario: Click exercise - click button which becomes green
    Given click exercise page opened
    When user clicks blue button that ignores DOM event
    Then button becomes green

  @TextInput
  Scenario: Text input exercise - set new button name and click the button
    Given text input exercise page opened
    When user sets new button name
    And user clicks changing name button
    Then button name changes

  @ScrollBars
  Scenario: Scroll bars exercise - find hidden button and click it
    Given scroll bars exercise page opened
    When user finds a hidden button
    Then user clicks hidden button

  @DynamicTable
  Scenario: Dynamic table exercise - get value from the table and compare it with the value in the yellow label
    Given dynamic table exercise page opened
    Then value from the table equals value from the yellow bar

  @ProgressBar
  Scenario: Progress bar exercise - click start button and for for the progress bar reach 75%
    Given progress bar exercise page opened
    When user clicks start button
    And user clicks stop button when progress bar reaches 75%
    Then result should be less than 5

  @Visibility
  Scenario: Visibility exercise - press hide button and check if other buttons visible or not
    Given visibility exercise page opened
    When user clicks hide button
    Then other buttons should not be visible


  @Login
  @SampleApp
  Scenario: Sample app exercise - fill in and submit form
    Given sample app exercise page opened
    When user fills the form
    And user submits the form
    Then logout button appears

  @Logout
  @SampleApp
    Scenario: Sample app exercise - logout after successful login
    Given sample app exercise page opened
    And user did login
    When user clicks logout button
    Then login button appears

  @MouseOver
  Scenario: Mouse over exercise - hover mouse over link and click two times
    Given mouse over exercise page opened
    When user clicks link two times
    Then click counter should be equal 2
