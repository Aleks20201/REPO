package login;

import common.BaseSeleniumTest;
import org.openqa.selenium.By;

public class Test extends BaseSeleniumTest {


    public void startTest() {
        driver.get(baseUrl);

        driver.findElement(By.linkText("Cameras")).click();


    }


}
