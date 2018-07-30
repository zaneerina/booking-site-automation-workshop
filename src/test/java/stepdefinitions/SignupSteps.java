package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.*;
import static utils.RandomGenerator.generateRandomString;

public class SignupSteps {

   private SignUpPageObject signup = new SignUpPageObject();
   private User user = new User();
   private User userTwo = new User ("Janis", "Berzins");

    @And("^I enter First name in the signup page$")
    public void iEnterFirstNameInTheSignupPage() throws Throwable {
       signup.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name in the signup page$")
    public void iEnterLastNameInTheSignupPage() throws Throwable {
       signup.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number in the signup page$")
    public void iEnterMobileNumberInTheSignupPage() throws Throwable {
       signup.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address in the signup page$")
    public void iEnterEmailAddressInTheSignupPage() throws Throwable {
      signup.enterEmail(user.getEmailAddress());

    }

    @And("^I enter Password in the signup page$")
    public void iEnterPasswordInTheSignupPage() throws Throwable {
       signup.enterPassword(user.getPassword());
    }
    @And("^I confirm Password in the signup page$")
    public void iConfirmPasswordInTheSignupPage() throws Throwable {
        signup.enterConfirmationPassword(user.getPassword());
    }

    @And("^I create new account$")
    public void iCreateNewAccount() throws Throwable {
        iEnterFirstNameInTheSignupPage();
        iEnterLastNameInTheSignupPage();
        iEnterMobileNumberInTheSignupPage();
        iEnterEmailAddressInTheSignupPage();
        iEnterPasswordInTheSignupPage();
        iConfirmPasswordInTheSignupPage();

    }



}