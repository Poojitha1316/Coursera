package PageObjects;

import BaseTest.BaseTestClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends BaseTestClass {

   @FindBy(xpath = "//*[@placeholder='What do you want to learn?']")
   WebElement search;

   @FindBy(xpath = "//*[@class='nostyle mobile-magnifier left-hand-search-btn']")
   WebElement clickable_btn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void exploreCourses() {
        search.click();
        search.sendKeys("free");
        clickable_btn.click();
    }
}
