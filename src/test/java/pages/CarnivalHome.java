package pages;


public class CarnivalHome extends BasePage{
    private String destinationDpdwn = "//a[@id='cdc-destinations']";
    private String destinationValue = "//ul[@class='cdc-filter-cols-wrapper']/li[2]";
    private String durationDpdwn = "//a[@id='cdc-durations']";
    private String durationValue = "//ul[@class='cdc-filter-cols-wrapper']/li[2]";
    private String searchButton = "//a[@class='cdc-filters-search-cta']";
    private String closeButtonPopUp = "//button[@class='vifp-sweeps-modal-close']";
    public CarnivalHome() {
        super(driver);
    }
    public void validateInitialPopUp(){
        validateInitialPopUp(closeButtonPopUp);
    }
    public SearchResultsPage enterSearchCriteria(String destinationPort, String duration){
        clickElement(destinationDpdwn);
        selectElement(destinationValue);
        clickElement(durationDpdwn);
        selectElement(durationValue);
        clickElement(searchButton);
        return new SearchResultsPage();
    }

}
