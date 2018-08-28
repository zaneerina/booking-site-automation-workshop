Feature: This feature is about creating a new account in the system
# @TEST
  Scenario: Successful sign-up
    Given Landing page is opened
    When I select My account menu
      And I select Sign up button in Navigation bar
      And Signup page is open
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I enter Password
      And I confirm Password
      And I select Signup button in Signup page
    Then user account page is opened 


  Scenario: Unsuccessful sign-up
    Given Landing page is opened
    When I select My account menu
      And I select Sign up button in Navigation bar
      And Signup page is open
      And I select Signup button in Signup page
   # Then user account page is opened 
    Then error messages are displayed
      And Signup page is open