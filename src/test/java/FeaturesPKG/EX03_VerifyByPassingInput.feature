Feature: Login to Application
  Scenario: Login to Application with valid credentials
    Given User is on Login Page
    When User Enter UserName
    And User Enter Password
    And User click on Login button
    Then User redirected to Home page



  Scenario: Logn to Application with Invalid credentials
    Given User is on Login Page
    When User Enter UserName as "Vaishnavi"
    And User Enter Password as "1234"
    And User click on Login button
    Then User redirected to Home page
