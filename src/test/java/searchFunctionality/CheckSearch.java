package searchFunctionality;

import common.BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;


public class CheckSearch extends BaseSeleniumTest {
    private static final Logger LOGGER = Logger.getLogger(CheckSearch.class.getName());
    String searchBar = applicationProperties.readProperty("search.bar");
    String typeMobile = "mobile";
    String searchButton = applicationProperties.readProperty("search.button");
    String expectedTitle = "Search - mobile";
    String searchCriteria = applicationProperties.readProperty("search.criteria");
    String iphone = "iphone";
    String checkBox = applicationProperties.readProperty("search.in.product.description");

    @Test
    public void startTest() throws InterruptedException {

        driver.get(baseUrl);
        LOGGER.info("Open page 'YourStore'");
        wait.until(ExpectedConditions.elementToBeClickable(By.name(searchBar))).sendKeys(typeMobile);
        LOGGER.info("Enter text inside the search bar");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchButton))).click();
        Assert.assertEquals(expectedTitle, driver.getTitle());
        LOGGER.info("Open page 'Search - mobile'");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(searchCriteria))).sendKeys(iphone);
        LOGGER.info("Enter text in 'Search Criteria'");
        wait.until(ExpectedConditions.elementToBeClickable(By.id(checkBox))).click();
        LOGGER.info("Mark check box");
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/select")));
        select.selectByIndex(2);
        LOGGER.info("Select 'PC' from drop down");
        Thread.sleep(2000);


    }
}
