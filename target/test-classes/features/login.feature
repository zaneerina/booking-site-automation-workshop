# new feature
# Tags: optional

Feature: This feature is about logging into the user account

  Scenario: Successful login
    Given I have opened homepage
    When I select My account menu
    And I select Login button
    And I enter Email address in login form
    And I enter Password in login form
    And I select Sign up button in login form
    Then user account page is opened 