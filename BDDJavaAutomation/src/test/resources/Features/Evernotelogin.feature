Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user is on home page
    And user click login button
    When user enters email and password
    And user clicks the login button
    Then user is navigated to home page
