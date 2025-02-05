package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.FacebookPage;

public class FacebookStepdef {

	
	public WebDriver driver;
	public FacebookPage fbPage;	
	
	@Given("user launch URL for Facebook Application")
	public void user_launch_URL_for_Facebook_Application() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   fbPage=new FacebookPage(driver);
	   fbPage.launchUrl();
	}

	@When("user enters the credetials")
	public void user_enters_the_credetials() {
		fbPage.enterCred();
	}

	@Then("user validate the Home Page")
	public void user_validate_the_Home_Page() throws IOException  {
		fbPage.validateHome();
	}
}
