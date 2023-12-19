package pageObjects;

import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BaseClass {
    public AddToCart(WebDriver driver) {
        super(driver);
    }

    //Elemsnts
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement btnAddtocart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement btnCart;

    @FindBy(name = "checkout")
    WebElement btnCheckout;

    @FindBy(name = "firstName")
    WebElement txtInfofirstname;

    @FindBy(name = "lastName")
    WebElement txtInfolastname;

    @FindBy(name = "postalCode")
    WebElement txtPostalcode;

    @FindBy(name = "finish")
    WebElement btnFinish;

    @FindBy(name = "back-to-products")
    WebElement btnBacktohome;

    @FindBy(name = "continue")
    WebElement btnContinue;


    //Action

    public void clickAddtocart(){
        btnAddtocart.click();
    }

    public void clickCart(){
        btnCart.click();
    }

    public void clickCheckout(){
        btnCheckout.click();
    }

    public void setTxtFirstname(String firstname){
        txtInfofirstname.sendKeys(firstname);

    }

    public void setTxtLastname(String lastname){
        txtInfolastname.sendKeys(lastname);

    }

    public void setTxtPostalcode(String postalcode){
        txtPostalcode.sendKeys(postalcode);

    }

    public void clickContinue(){

        btnContinue.click();
    }

    public void clickFinish(){

        btnFinish.click();
    }

    public void clickBacktohome(){

        btnBacktohome.click();
    }











}
