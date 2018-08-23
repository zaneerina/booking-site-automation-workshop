package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;
import io.netty.handler.codec.socks.SocksAddressType;

import javax.xml.soap.SOAPPart;

public class SearchSteps {

    private TestContext test;
    public SearchSteps (TestContext testContext){
        this.test = testContext;
    }

    @And("^I select book Hotels button$")
    public void iSelectBookHotelsButton()  {
        test.getHomepagePage().selectHotelsButton();
    }


    @And("^I enter ([^\"]*) hotel")
    public void iEnterHotelName(String hotel) throws InterruptedException {
        Thread.sleep(1000);
        test.getBookHotelsPage().enterHotelName(hotel);
    }

    @And("^I select hotel located in Singapore$")
    public void iSelectHotelLocatedInSingapore() throws Throwable {
        test.getBookHotelsPage().selectSingaporeHotel();
    }


    @And("^I select ([^\"]*) checkInDate")
    public void iSelectAsCheckInDate(String checkInDate) throws InterruptedException {
        Thread.sleep(3000);
       test.getBookHotelsPage().enterCheckInDate(checkInDate);

    }

    @And("^I select ([^\"]*) as Check out date$")
    public void iSelectAsCheckOutDate(String checkOutDate) throws InterruptedException {
        Thread.sleep(6000);
        test.getBookHotelsPage().enterCheckOutDate(checkOutDate);

    }


    @And("^I select 2 Adult and ([^\"]*) Children$")
    public void iSelectAdultAndChildren(String Children) throws InterruptedException {
        test.getBookHotelsPage().setAmountOfTravellers();
        test.getBookHotelsPage().enterAmountOfChildren(Children);
        Thread.sleep(5000);
    }

    @And("^I select Search button$")
    public void iSelectSearchButton()  {
    test.getBookHotelsPage().selectSearchHotelButton();
    }

    @And("^I select Junior Suites room$")
    public void iSelectJuniorSuitesRoom() {
        test.getHotelDetailPage().locateRoomsSection();
        test.getHotelDetailPage().tapOnBookNowJunior();

    }

    @And("^I select “Confirm this booking” button$")
    public void iSelectConfirmThisBookingButton() throws InterruptedException {
        Thread.sleep(2000);
        test.getReservationPage().selectConfirmThisBookingButton();
    }

    @Then("^Unpaid invoice page is opened$")
    public void unpaidInvoicePageIsOpened()  {
        System.out.print("INVOICE IS SENT TO YOUR MAIL. PLEASE FOLLOW THE INSTRUCTIONS.");
    }
}
