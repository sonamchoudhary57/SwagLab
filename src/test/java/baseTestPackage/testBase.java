package baseTestPackage;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.LoginPage;
import utils.ReadProperties;

import java.time.Duration;

public class testBase {
   public WebDriver driver;
    @BeforeSuite
    public void setup() throws Exception {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonam\\IdeaProjects\\SwagLab\\src\\test\\resources\\chromedriver-win64\\chromedriver.exe"    );
        driver=new ChromeDriver();
        driver.get(ReadProperties.getValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }

    public String randomString(){
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }

    public String randomNumber(){

        String generatedString2 = RandomStringUtils.randomNumeric(10);
        return (generatedString2);

    }

    public String randomAlphaNumeric(){
        String st = RandomStringUtils.randomAlphabetic(5);
        String num = RandomStringUtils.randomNumeric(10);
        return (st+num);
    }
}
