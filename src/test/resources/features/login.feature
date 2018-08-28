# new feature
# Tags: optional

Feature: This feature is about logging into the user account

  Scenario: Successful login
    Given: Landing page is opened
      And I select My account menu
      And I select Sign up button in Navigation bar
      And Signup page is open
      And I create new account
      And user account page is opened 
      And I select User Account button
      And I logout
    When I select My account menu
      And I select Login button
      And Login page is opened
      And I enter Email address in login form
      And I enter Password in login form
      And I select Login button in Login form
    Then user account page is opened 


 # Scenario: Successful login - full login
 #   Given I Navigate to Signup page
 #   When I create new account
 #   And I logout
#    Then I login into account


