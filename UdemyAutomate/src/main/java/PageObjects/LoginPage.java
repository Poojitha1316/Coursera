package PageObjects;

import BaseTest.BaseTestClass;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BaseTestClass {

    @FindBy(xpath = "//*[@placeholder='name@email.com']")
    WebElement email_field;

    @FindBy(xpath = "//*[@placeholder='Enter your password']")
    WebElement password_field;

    @FindBy(xpath = "//*[text()='Login']")
    WebElement click_submit;

    @FindBy(xpath = "//*[text()='Skip']")
    WebElement click_skip;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    
    public void landOnLogin() throws InterruptedException {
        email_field.sendKeys("saikumarkolli7372@gmail.com");
        password_field.sendKeys("Saikumar@123");
        click_submit.click();
        Thread.sleep(6000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//        click_skip.click();
    }
    

}
