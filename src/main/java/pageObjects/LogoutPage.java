package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
    //Elements
    @FindBy(xpath = "//button[text()='Open Menu']")
    WebElement hamburgericonMenu;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement btnLogout;

    public LogoutPage(WebDriver driver) {
    }

    //Action
    public void clickOpenmenu(){
        hamburgericonMenu.click();
    }
    public void clickLogout(){
        btnLogout.click();
    }

}
