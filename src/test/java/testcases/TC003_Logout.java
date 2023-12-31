package testcases;

import baseTestPackage.testBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import utils.ReadProperties;

import static org.testng.AssertJUnit.assertTrue;

public class TC003_Logout extends testBase {
    @Test(priority = 0, groups = {"Regression","Master"})
    public void TC001_LoginTest(){
        LoginPage lp = new LoginPage(driver);
        lp.setTxtUsername(ReadProperties.getValue("username"));
        lp.setTxtPassword(ReadProperties.getValue("password"));
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"Swag Labs");



    }
@Test(priority = 1,groups = {"Regression","Master"})
    public void TC003_Logout() {
         LogoutPage lg = new LogoutPage(driver);
         lg.clickOpenmenu();
         lg.clickLogout();
        String actualString = driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();
        assertTrue(actualString.equalsIgnoreCase("Accepted usernames are:"));

    }
}
