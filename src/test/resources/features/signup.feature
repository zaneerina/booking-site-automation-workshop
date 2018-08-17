Feature: This feature is about creating a new account in the system

  Scenario: Successful sign-up
    Given I have opened homepage
    When I select My account menu
      And I select Sign up button in Home page
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I enter Password
      And I confirm Password
      And I select Signup button in Signup page
    Then user account page is opened 

  Scenario: Unsuccessful sign-up
    Given I have opened homepage
    When I select My account menu
      And I select Sign up button in Home page
      And I select Signup button in Signup page
    Then user account page is opened 