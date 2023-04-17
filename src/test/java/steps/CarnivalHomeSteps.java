package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CarnivalHome;
import pages.SearchResultsPage;

public class CarnivalHomeSteps {
    CarnivalHome carnivalHome = new CarnivalHome();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    @Given("^User navigates to (.+) page$")
    public void userNavigatesToCarnivalPortal(String portal){
        carnivalHome.navigateTo(portal);
    }
    @When("^User search a cruiser to (.+) with duration of (.+) days$")
    public void searchCruiser(String destinationPort, String duration){
        carnivalHome.enterSearchCriteria(destinationPort, duration);
    }
}
