package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    //selenide funkcijas:
    //nodefineet piekluvi elementam, kur objekti bus privati, tips SelenideElement (selenide atribuuts)
    //pirmaa metode:  private SelenideElement myAccountButton = $("test");
    //otraa metode; dinamiskaakai piekluvei:
    private SelenideElement getMyAccountButton() {

        return $("test");
    }
    private SelenideElement getSignUpButton() {

        return $("test");
    }
    // public metodei var pieklut jebkurs; void neatgriez neko; click atradiis elementu un uzklikos:

    public void selectMyAccountButton() {

    getMyAccountButton().click();

    }

    //bez void jaanoraada, ko atgriezt

    public SignUpPageObject selectSignUpButton(){
        getSignUpButton().click();
        return page(SignUpPageObject.class); //izpildot šo, tiks atgriezts SignUpPageObject clases objekts

    }
}
