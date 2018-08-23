package pages.hotelreservation;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationPageObject {

    private SelenideElement getConfirmThisBookingButton(){
        return $(".completebook");
    }

    // public InvoicePageObject selectConfirmThisBookingButton() {
    public void selectConfirmThisBookingButton() {
        getConfirmThisBookingButton().click();
       // return page(InvoicePageObject.class);
    }
}
