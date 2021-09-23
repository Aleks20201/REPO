package login;

import common.BaseSeleniumTest;
import org.testng.annotations.Test;

public class LogInLikeNewCustomer extends BaseSeleniumTest {
    String myAccound = this.applicationProperties.readProperty("myaccound.xpath");
    String login = this.applicationProperties.readProperty("login.xpath");
    String email = this.applicationProperties.readProperty("email.adress.xpath");
    String loginButton = this.applicationProperties.readProperty("login.button.xpath");

    @Test
    public void startTest() {
        driver.get(baseUrl);
        testUtils.clickOnButton(driver, wait, myAccound);
        testUtils.clickOnButton(driver, wait, login);
        testUtils.fillInputField(driver, wait, email, "aleksandraglisic@gmail.com");
        testUtils.fillInputField(driver, wait, email, "1708");
        testUtils.clickOnButton(driver, wait, loginButton);

    }

}

