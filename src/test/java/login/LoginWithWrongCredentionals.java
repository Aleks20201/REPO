package login;

import common.BaseSeleniumTest;

public class LoginWithWrongCredentionals extends BaseSeleniumTest {
    String accound = this.applicationProperties.readProperty("myaccound.xpath");
    String emailAdress = this.applicationProperties.readProperty("email.xpath");
    String loginButton = this.applicationProperties.readProperty("login.xpath");
    String password = this.applicationProperties.readProperty("passwordd.xpath");
    String loginButtonn = this.applicationProperties.readProperty("login.button.xpath");
    String mail = "aleksandraglisic2611@gmail";
    String passwordd = "1708";
    String partialCAmeras = this.applicationProperties.readProperty("partial.text");

    public void loginWithWrongCredentionals() {
        driver.get(baseUrl);
        testUtils.clickOnButton(driver, wait, accound);
        testUtils.clickOnButton(driver, wait, loginButton);
        testUtils.fillInputField(driver, wait, emailAdress, mail);
        testUtils.clickOnButton(driver, wait, passwordd);
        testUtils.clickOnButton(driver, wait, loginButtonn);


    }


}
