package pages;

public class ItineraryPage extends BasePage{
    private String lbl_itineraryLabel = "//div[@id='itinerary']";
    public ItineraryPage(){
        super(driver);
    }

    public String validateUserInItineraryPage(){
        return getTextFromElement(lbl_itineraryLabel);
    }

}
