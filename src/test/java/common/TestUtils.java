package common;

import
        org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils {

    // na jednom mestu pises na vise mesta pozivas i koristis
    public void exampleUtilFunction(WebDriver driver, WebDriverWait wait) {

    }


    public void fillInputField(WebDriver driver, WebDriverWait wait, String element, String writing) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).sendKeys(writing);

    }

    public void clickOnButton(WebDriver driver, WebDriverWait wait, String element) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element))).click();


    }


    public void nekaFunkcija(WebDriver driver, WebDriverWait wait, String element) {

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(element))).click();
        if (element.equals("Cameras")) {
            System.out.println("Dobro je");
        }

    }

}

