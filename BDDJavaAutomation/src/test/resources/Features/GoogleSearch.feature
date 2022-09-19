Feature: Check google search functionlaity

  Scenario: Validate google search is working
    Given browser is open
    And user is on the google search box
    When user enters a text in the google search box
    And hits Enter
    Then user is navigated to results page
    