package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ItineraryPage;
import pages.SearchResultsPage;

public class ItineraryPageSteps {
    ItineraryPage itineraryPage = new ItineraryPage();
    @Then("^The user should be taken to (.+) page$")
    public void userIsInItineraryPage(String pageTitle){
        Assert.assertEquals(itineraryPage.validateUserInItineraryPage().toUpperCase(), pageTitle);
    }
}
