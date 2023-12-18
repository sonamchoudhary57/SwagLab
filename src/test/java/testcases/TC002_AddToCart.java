package testcases;
import basePackage.BaseClass;
import baseTestPackage.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddToCart;
import pageObjects.LoginPage;
import utils.ReadProperties;

import static org.testng.AssertJUnit.assertTrue;

public class TC002_AddToCart extends testBase {
    public void TC002_AddToCart() throws Exception{

        AddToCart ac = new AddToCart(driver);
        ac.clickAddtocart();
        ac.clickCart();
        ac.clickCheckout();
        ac.setTxtFirstname("sonam");
        ac.setTxtLastname("choudhary");
        ac.setTxtPostalcode("121008");
        ac.clickFinish();
        String actualString = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText();
        assertTrue(actualString.contains("Thank you for your order!"));
        ac.clickBacktohome();

    }
}
