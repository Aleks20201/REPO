package login;

import common.BaseSeleniumTest;
import org.testng.annotations.Test;

public class LoginLikeReturnCustomer extends BaseSeleniumTest {
    String accound = this.applicationProperties.readProperty("myaccound.xpath");
    String emailAdress = this.applicationProperties.readProperty("email.xpath");
    String loginButton = this.applicationProperties.readProperty("login.xpath");
    String password = this.applicationProperties.readProperty("passwordd.xpath");
    String forgottenPassword = this.applicationProperties.readProperty("forgotten.password");
    String emailFieldForgotten = this.applicationProperties.readProperty("email.adress.forgotten");
    String continues = this.applicationProperties.readProperty("continue.button.forgottten.password");
    String backButton = this.applicationProperties.readProperty("back.button.forgotted");
    String mail = "aleksandraglisic2611@gmail.com";
    String passwordd = "1708";

    @Test
    public void startLoginLikeReturningCustomer() {
        driver.get(baseUrl);
        testUtils.clickOnButton(driver, wait, accound);
        testUtils.clickOnButton(driver, wait, loginButton);
        testUtils.fillInputField(driver, wait, emailAdress, mail);
        testUtils.fillInputField(driver, wait, password, passwordd);
        testUtils.clickOnButton(driver, wait, forgottenPassword);
        //testUtils.clickOnButton(driver, wait, backButton); this is mistake
        testUtils.fillInputField(driver, wait, emailFieldForgotten, mail);
        testUtils.clickOnButton(driver, wait, continues);

    }


}
