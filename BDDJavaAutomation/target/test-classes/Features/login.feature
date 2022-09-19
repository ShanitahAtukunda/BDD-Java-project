@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login is successful with login credentials
    Given user is on the login page
    When user enters user name and password
    And clicks the login button
    Then user is navigates to the home page

  Scenario Outline: Check login is successful with login credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks the login button
    Then user is navigates to the home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
