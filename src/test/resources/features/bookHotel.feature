# new feature
# Tags: optional

Feature: This feature is about booking a hotel room
@TEST
  Scenario: Book a hotel room
    Given Landing page is opened
      And I Navigate to Signup page
      And Signup page is open
      And I create new account
      And user account page is opened 
    When I select Home button in Navigation bar
      And Landing page is opened
      And I select book Hotels button
      And I enter Rendezvous Hotels hotel
      And The hotel in Singapore is found
          #chech if only one Hotel is displayed
      And I select hotel located in Singapore
      And I select 01/09/2018 checkInDate
      And I select 09/09/2018 as Check out date
      And I select 2 Adults and 2 Children
      And I select Search button
      And Hotel details page is opened
          # check if the correct page is displayed
      And Hotel details are correct
          #check if the data is correct: check-in date; check-out date; no.of Adults; no. of Children
      And I select Junior Suites room
      And Booking confirmation page is opened
          #check if the button Confirm this booking is displayed
      And personal data is correct
          # check if the data is correct: first name, last name, email address; check if the selected hotel is correct
          # create a new object Booking under the general package which will store the info related to booking a hotel
      And I select “Confirm this booking” button
    Then Unpaid invoice page is opened
          # check that the Invoice page is displayed; add sync to the page: wait until
          # check that the correct data is displayed: check-in date, check-out date, room type;
