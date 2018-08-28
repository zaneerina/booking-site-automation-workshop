package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;
import io.netty.handler.codec.socks.SocksAddressType;

import javax.xml.soap.SOAPPart;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchHotelSteps {

    private TestContext test;
    public SearchHotelSteps(TestContext testContext){
        this.test = testContext;
    }


    @And("^I enter ([^\"]*) hotel")
    public void iEnterHotelName(String hotel) throws InterruptedException {

        test.getBookHotelsPage().enterHotelName(hotel);
    }

    @And("^I select hotel located in Singapore$")
    public void iSelectHotelLocatedInSingapore()  {
        test.getBookHotelsPage().selectSingaporeHotel();
    }


    @And("^I select ([^\"]*) checkInDate")
    public void iSelectAsCheckInDate(String checkInDate) throws InterruptedException {

       test.getBookHotelsPage().enterCheckInDate(checkInDate);

    }

    @And("^I select ([^\"]*) as Check out date$")
    public void iSelectAsCheckOutDate(String checkOutDate) throws InterruptedException {

        test.getBookHotelsPage().enterCheckOutDate(checkOutDate);

    }


    @And("^I select 2 Adult and ([^\"]*) Children$")
    public void iSelectAdultAndChildren(String Children) throws InterruptedException {
        test.getBookHotelsPage().setAmountOfTravellers();
        test.getBookHotelsPage().enterAmountOfChildren(Children);

    }

    @And("^I select Search button$")
    public void iSelectSearchButton()  {
    test.getBookHotelsPage().selectSearchHotelButton();
    }


    @And("^The correct amount of hotels is found$")
    public void theCorrectAmountOfHotelsIsFound()  {


     assertThat(test.getBookHotelsPage().getTheCityName()).isEqualTo("Singapore");

    }
}
