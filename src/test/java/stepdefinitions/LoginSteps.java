package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private TestContext test;
    public LoginSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I enter Email address in login form$")
    public void iEnterEmailAddressInLoginForm()  {
        // login.enterEmail(user.getEmailAddress());
        // --> login: test.getLoginPage; user: test.getUser();
        test.getLoginPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter Password in login form$")
    public void iEnterPasswordInLoginForm()  {
         test.getLoginPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I select Login button in Login form$")
    public void iSelectLoginButtonInLoginForm()  {
        test.getLoginPage().selectLogInButton();
    }

    @And("^I login into account$")
    public void iLoginIntoAccount()  {
        iEnterEmailAddressInLoginForm();
        iEnterPasswordInLoginForm();
        iSelectLoginButtonInLoginForm();
    }


    @And("^Login page is opened$")
    public void loginPageIsOpened()  {

        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getLoginPage().getLoginFormTitleText()).isEqualTo("LOGIN");
        assertThat(test.getLoginPage().isLoginButtonVisible()).isTrue();
    }


}
