package pageObjects;
import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    //Elements
    @FindBy(name="user-name")
    WebElement txtUsername;

    @FindBy(name="password")
    WebElement txtPassword;

    @FindBy(id = "login-button")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    //Action

    public void setTxtUsername(String username){
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

}
