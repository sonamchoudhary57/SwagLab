package pageObjects;

import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BaseClass {
    //Elements
    @FindBy(xpath = "//button[@id = 'react-burger-menu-btn']")
    WebElement hamburgericonMenu;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement btnLogout;

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    //Action
    public void clickOpenmenu(){
        hamburgericonMenu.click();
    }
    public void clickLogout(){
        btnLogout.click();
    }

}
