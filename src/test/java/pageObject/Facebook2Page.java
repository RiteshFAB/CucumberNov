package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook2Page {

	WebDriver rDriver;
	
	
	public Facebook2Page(WebDriver lDriver) {
		
		rDriver=lDriver;
		
		PageFactory.initElements(lDriver, this);
		
	}
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement user;
	@FindBy(xpath="//input[@type='password']")
	public WebElement pass;	
	@FindBy(xpath="//button[@name='login']")
	public WebElement button;
	
	
	public void launchUrl() {
		
		rDriver.get("https://www.facebook.com/");
		
	}
	
	public void entersCread() {
		
		user.sendKeys("ritesh");
		pass.sendKeys("12345");
		button.click();
	}
	
	public void homePage() {
		
		String title=rDriver.getTitle();
		System.out.println(title);
	}
}
