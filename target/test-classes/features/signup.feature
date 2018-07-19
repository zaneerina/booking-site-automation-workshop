Feature: This feature is about creating a new account in the system

  Scenario: Successful sign-up
    Given I have opened homepage
    When I select My account menu
      And I select Sign up button
      And I enter First name in the signup page
      And I enter Last name in the signup page
      And I enter Mobile number in the signup page
      And I enter Email address in the signup page
      And I enter Password in the signup page
      And I confirm Password in the signup page
      And I select Sign up button in the signup page
    Then user account page is opened 

  Scenario: Unsuccessful sign-up
    Given I have opened homepage
    When I select My account menu
      And I select Sign up button in the signup page
      And I select Sign up button in the signup page
    Then user account page is opened 