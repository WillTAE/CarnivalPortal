package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/automation_drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void navigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){
        Find(locator).click();
    }
    public void selectElement(String locator){
        Find(locator).click();
    }
    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

    public boolean filterByElementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }
    public void write(String locator, String text){
        Find(locator).clear();
        Find(locator).sendKeys(text);
    }

    public String getTextFromElement(String locator){
        return Find(locator).getText();
    }
    public void closeInitialPopUp(String locator){
        if(Find(locator).isDisplayed()){
            Find(locator).click();
        }
    }
    public List<WebElement> bringMeAllPrices(String locator){
        return driver.findElements(By.xpath(locator));
    }
    public static void closeBrowser(){
        driver.quit();
    }
}
