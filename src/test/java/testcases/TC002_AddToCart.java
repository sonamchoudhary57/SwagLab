package testcases;
import basePackage.BaseClass;
import baseTestPackage.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AddToCart;
import pageObjects.LoginPage;
import utils.ReadProperties;

import static org.testng.AssertJUnit.assertTrue;

public class TC002_AddToCart extends testBase {
    @Test(priority = 0,groups = {"Regression","Master"})
    public void TC001_LoginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.setTxtUsername(ReadProperties.getValue("username"));
        lp.setTxtPassword(ReadProperties.getValue("password"));
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"Swag Labs");



    }

    @Test(groups = {"Sanity", "Master"})
    public void TC002_AddToCart() {

        AddToCart ac = new AddToCart(driver);
        ac.clickAddtocart();
        ac.clickCart();
        ac.clickCheckout();
        ac.setTxtFirstname("sonam");
        ac.setTxtLastname("choudhary");
        ac.setTxtPostalcode("121008");
        ac.clickContinue();
        ac.clickFinish();
        String actualString = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText();
        assertTrue(actualString.equalsIgnoreCase("Thank you for your order!"));
        ac.clickBacktohome();

    }
}
