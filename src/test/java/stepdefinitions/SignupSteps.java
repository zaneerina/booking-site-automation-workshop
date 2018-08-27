package stepdefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

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


    @And("^Signup page is open$")
    public void signupPageIsOpen() {
        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getSignUpPage().getFormTitleText()).isEqualTo("SIGN UP");
        assertThat(test.getSignUpPage().isSignUpButtonVisible()).isTrue();
    }

    @Then("^error messages are displayed$")
    public void errorMessagesAreDisplayed() {

        test.getSignUpPage().waitUntilErrorMessagesAreDisplayed();
        // bez shiis metodes asserti feilo, jo elementi veel nav displayed
        assertThat(test.getSignUpPage().getErrorMessagesCount()).isEqualTo(5);
        assertThat(test.getSignUpPage()
                .getAllErrorMessages().toString()).contains("The First name field is required.");


    }
}