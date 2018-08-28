package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class HotelDetailsSteps {

    private TestContext test;
    public HotelDetailsSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I select Junior Suites room$")
    public void iSelectJuniorSuitesRoom() {
        test.getHotelDetailPage().locateRoomsSection();
        test.getHotelDetailPage().tapOnBookNowJunior();

    }

    @And("^Hotel details page is opened$")
    public void hotelDetailsPageIsOpened()  {

        test.getHotelDetailPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getHotelDetailPage().getHotelDetailsHeaderText()).isEqualTo("RENDEZVOUS HOTELS");
        assertThat(test.getHotelDetailPage().isDescriptionBoxVisible()).isTrue();

    }

    @And("^Hotel details are correct$")
    public void hotelDetailsAreCorrect()   {

        assertThat(test.getHotelDetailPage().getAmountOfAdultsAsString()).isEqualTo(test.getBooking().getNoOfAdults());
        assertThat(test.getHotelDetailPage().getAmountOfChildrenAsString()).isEqualTo(test.getBooking().getNoOfChildren());
        assertThat(test.getHotelDetailPage().getChekinDateText()).isEqualTo(test.getBooking().getCheckInDate());
        assertThat(test.getHotelDetailPage().getCheckoutDateText()).isEqualTo(test.getBooking().getCheckOutDate());
    }


}
