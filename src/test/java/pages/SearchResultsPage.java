package pages;


import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends BasePage{
    private String lbl_filterBy = "//div[@class='sc-eUXrtT fNlJAZ']/div/div";
    private String searchPrices = "//div[@class='sc-bALXmG kZgZhn']/div[2]";
    private String firsPriceInGrid = "(//div[@class='sc-bALXmG kZgZhn']/div[2])[1]";
    public SearchResultsPage() {
        super(driver);
    }

    public int getCheapestValueFromGrid(){
        List<WebElement> listOfPrices = bringMeAllPrices(searchPrices);
        List<String> stringsOfPrices = new ArrayList<>();

        for (WebElement price:listOfPrices) {
            stringsOfPrices.add(price.getText());
        }
        List<Integer> pricesList = stringsOfPrices.stream()
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
        int minPrice = Collections.min(pricesList);

        return minPrice;
    }
    public int getFirstPriceFromGrid(){
        String firstPriceFromGrid = getTextFromElement(firsPriceInGrid);
        return Integer.parseInt(firstPriceFromGrid);
    }
    public boolean validateFilterByIsPresentInSearchResults(){
        return elementIsDisplayed(lbl_filterBy);
    }

}
