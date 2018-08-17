package stepdefinitions;


import cucumber.api.java.en.And;
import general.TestContext;

public class SignupSteps {

    private TestContext test; //jauns mainigais test ar tipu TestContext

    public SignupSteps(TestContext testContext){ //konstruktors, kuram padots parametrs(visi TestContext klases objekti))
        this.test = testContext;
    }


    @And("^I enter First name$")
    public void iEnterFirstName()  {
       test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName()  {
       // signup.enterLastName(user.getLastName());
        // --> lai tiktu pie signup: test.getSignUpPage; lai tiktu pie user datiem: test.getUser();
      test.getSignUpPage().enterLastName(test.getUser().getLastName());

    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber()  {
       test.getSignUpPage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress()  {
      test.getSignUpPage().enterEmail(test.getUser().getEmailAddress());

    }

    @And("^I enter Password$")
    public void iEnterPassword()  {
       test.getSignUpPage().enterPassword(test.getUser().getPassword());
    }
    @And("^I confirm Password$")
    public void iConfirmPassword()  {
        test.getSignUpPage().enterConfirmationPassword(test.getUser().getPassword());
    }

    @And("^I select Signup button in Signup page$")
    public void iSelectSignUpButtonInSignUpPage()  {
        test.getSignUpPage().selectSignUpButton();
    }

    @And("^I create new account$")
    public void iCreateNewAccount()  {
        iEnterFirstName();
        iEnterLastName();
        iEnterMobileNumber();
        iEnterEmailAddress();
        iEnterPassword();
        iConfirmPassword();
        iSelectSignUpButtonInSignUpPage();
    }



}