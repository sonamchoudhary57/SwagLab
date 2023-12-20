package testcases;
import baseTestPackage.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utils.ReadProperties;


public class TC001_LoginTest extends testBase {

    @Test(groups = {"Regression","Master"})
    public void TC001_LoginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.setTxtUsername(ReadProperties.getValue("username"));
        lp.setTxtPassword(ReadProperties.getValue("password"));
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"Swag Labs");



    }

}
