package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ReservationConfirmationSteps {

    private TestContext test;
    public ReservationConfirmationSteps(TestContext testContext){

        this.test = testContext;
    }

    @And("^Booking confirmation page is opened$")
    public void bookingConfirmationPageIsOpened()  {
        assertThat(test.getReservationPage().isReservConfButtonDisplayed()).isTrue();

    }

    @And("^personal data is correct$")
    public void personalDataIsCorrect() {

        assertThat(test.getReservationPage().getFirstNameFieldText()).isEqualTo(test.getUser().getFirstName());
        assertThat(test.getReservationPage().getLastNameFieldText()).isEqualTo(test.getUser().getLastName());
        assertThat(test.getReservationPage().getEmailFieldText()).isEqualTo(test.getUser().getEmailAddress());
    }

    @And("^I select “Confirm this booking” button$")
    public void iSelectConfirmThisBookingButton() {

        test.getReservationPage().selectConfirmThisBookingButton();
    }



}
