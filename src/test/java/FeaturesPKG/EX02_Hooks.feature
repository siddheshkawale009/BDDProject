Feature: Login to App
  Scenario: Registration to Application with valid credentials
    Given User is on Registration Page
    When User Enter valid Mail
    And User Enter valid Mobile
    And User click on Submit button
    Then User redirected to Login page


  Scenario: Registration to Application with invalid credentials
    Given User is on Registration Page
    When User Enter invaid Mail
    And User Enter invaid Mobile Number
    And User click on Submit button
    Then User get the validation message


  Scenario: Login to Application with Invalid Mobile
    Given User is on Registration Page
    When User Enter vaid Mail
    And User Enter invaid Mobile Number
    And User click on Submit button
    Then User get the validation message


