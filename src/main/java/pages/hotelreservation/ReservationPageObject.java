package pages.hotelreservation;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.ladingpage.HomepagePageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationPageObject {

    private SelenideElement getConfirmThisBookingButton(){

        return $(".completebook");
    }

    private SelenideElement getFirstNameField(){
        return $(By.xpath("//label[contains(text(), \"First\")]//following-sibling::input"));
    }

    private SelenideElement getLastNameField(){
        return $(By.xpath("//label[contains(text(), \"Last\")]//following-sibling::input"));
    }

    private SelenideElement getEmailField(){
        return $(By.xpath("//label[contains(text(), \"Email\")]//following-sibling::input"));
    }

    public String getFirstNameFieldText(){
        return getFirstNameField().getValue();
    }
    public String getLastNameFieldText(){
        return getLastNameField().getValue();

    }
    public String getEmailFieldText(){
        return getEmailField().getValue();

    }

    public boolean isReservConfButtonDisplayed(){
        return getConfirmThisBookingButton().isDisplayed();
    }

     public InvoicePageObject selectConfirmThisBookingButton() {
   // public void selectConfirmThisBookingButton() {
        getConfirmThisBookingButton().click();
        return page(InvoicePageObject.class);
    }




}
