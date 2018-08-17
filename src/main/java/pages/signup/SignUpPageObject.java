package pages.signup;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("input[name = 'firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name='lastname']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name='phone']");
    }

    private SelenideElement getEmailField() {
        return $("input[name='email']");
    }
    private SelenideElement getPasswordField() {
        return $("input[name='password']");
    }

    private SelenideElement getConfirmationPasswordField() {
        return $("input[name='confirmpassword']");
    }
    private SelenideElement getSignUpButton() {
        return $(".btn-lg");
    }


    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname); //metode pieprasīs String vērtību, ko kā firstname izmantos, laiievadiitu laukaa
    }

    public void enterLastName(String lastname) {
        getLastNameField().sendKeys(lastname);
    }

    public void enterMobileNumber(String number){
        getMobileNumberField().sendKeys(number);
    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmationPassword(String password){
        getConfirmationPasswordField().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
}
