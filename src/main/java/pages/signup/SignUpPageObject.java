package pages.signup;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("test");
    }

    private SelenideElement getLastNameField() {
        return $("test");
    }

    private SelenideElement getMobileNumberField() {
        return $("test");
    }

    private SelenideElement getEmailField() {
        return $("test");
    }
    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getConfirmationPasswordField() {
        return $("test");
    }
    private SelenideElement getSignUpButton() {
        return $("test");
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
