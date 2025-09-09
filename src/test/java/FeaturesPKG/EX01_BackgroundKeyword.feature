Feature: Verify Login Functionality


  Background:
    Given User is present on login page
    And User enter valid Password




  Scenario: Verify with valid Username and Password
    And User enter valid Password
    And User click on Login BTN
    Then Home page is visible

  Scenario: Verify with invalid Username and invalid Password
    When User enter invalid Username
    And User click on Login BTN
    And Validation message
    Then Home page not visible


  Scenario: Verify with  Valid Username and invalid Password
    And User enter valid Password
    And User click on Login BTN
    Then Home page not visible