package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Facebook2Page;

public class Facebook2Stepdef {

   public WebDriver driver;
   public Facebook2Page fbPage;
	
	
   @Given("user launch URL")
   public void user_launch_URL() {
      WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver(); 
	  fbPage=new Facebook2Page(driver);
	  fbPage.launchUrl();
   }

   @When("user enters the creads")
   public void user_enters_the_creads() {
	   fbPage.entersCread();
   }

   @Then("user validate the new Home Page")
   public void user_validate_the_new_Home_Page() {
	   fbPage.homePage(); 
   }

}
