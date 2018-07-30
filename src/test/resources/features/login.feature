# new feature
# Tags: optional

Feature: This feature is about logging into the user account

  Scenario: Successful login - full login
    Given I Navigate to Signup page
    When I create new account
    And I logout
    Then I login into account


