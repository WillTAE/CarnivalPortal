package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchResultsPage;

public class SearchResultsPageSteps {
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    @When("^A user choose a sail from Search Results page$")
    public void chooseSailFromSearchResults(){
        searchResultsPage.goToItineraryPage();
    }
    @Then("^User should be taken to Search Results page$")
    public void validateFilterByLabelIsPresent(){
        Assert.assertTrue(searchResultsPage.validateFilterByIsPresentInSearchResults());
    }
    @Then("^A grid of results should be displayed with the cheapest value by default$")
    public void getResultsGrid(){
        Assert.assertEquals(searchResultsPage.getCheapestValueFromGrid(),
                searchResultsPage.getFirstPriceFromGrid());
    }

}
