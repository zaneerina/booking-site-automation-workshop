Feature: This feature is about creating a new account in the system

  Scenario: Successful sign-up

    Given I have opened a homepage
    When I select My account menu
      And I select SIgn up button
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email
      And I enter Password
      And I confirm Password
      And I select Sign up button
    Then user account page is openend