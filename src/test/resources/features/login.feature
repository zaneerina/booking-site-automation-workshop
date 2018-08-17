# new feature
# Tags: optional

Feature: This feature is about logging into the user account

  Scenario: Successful login
    Given: I have opened homepage
      And I Navigate to Signup page
      And I create new account
      And I select User Account button
      And I logout
    When I select My account menu
      And I select Login button
      And I enter Email address in login form
      And I enter Password in login form
      And I select Login button in Login form
    Then user account page is opened 


 # Scenario: Successful login - full login
 #   Given I Navigate to Signup page
 #   When I create new account
 #   And I logout
#    Then I login into account


