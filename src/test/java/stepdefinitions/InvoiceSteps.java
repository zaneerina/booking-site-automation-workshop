package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceSteps {


    private TestContext test;
    public InvoiceSteps(TestContext testContext){
        this.test = testContext;
    }

    @Then("^Unpaid invoice page is opened$")
    public void unpaidInvoicePageIsOpened() throws InterruptedException {

        test.getInvoicePage().waitUntilPageLoadingIsFinished();
        //Thread.sleep(5000);
        assertThat(test.getInvoicePage().isUnpaidInvoiceDisplayed()).isTrue();
        assertThat(test.getInvoicePage().getCheckInDateText()).isEqualTo(test.getBooking().getCheckInDate());
        assertThat(test.getInvoicePage().getCheckOutDateText()).isEqualTo(test.getBooking().getCheckOutDate());
        assertThat(test.getInvoicePage().getRoomTypeName()).isEqualTo(test.getBooking().getRoomType());

    }

}
