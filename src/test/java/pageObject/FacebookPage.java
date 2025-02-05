package pageObject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

	
	WebDriver rDriver;
	
	public FacebookPage(WebDriver lDriver) {
		
		rDriver=lDriver;
		PageFactory.initElements(lDriver,this);
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement user;
	@FindBy(xpath="//input[@type='password']")
	public WebElement pass;	
	@FindBy(xpath="//button[@name='login']")
	public WebElement button;
	
	
	
	public void launchUrl() {
		
		rDriver.get("https://www.facebook.com/");
	    rDriver.manage().window().maximize();	
	}
	
	public void enterCred() {
	
		user.sendKeys("Ritesh");
		pass.sendKeys("1234567");
		button.click();
		
	}
	
	
	public void validateHome() throws IOException {
		
		JavascriptExecutor js=(JavascriptExecutor)rDriver;
		js.executeScript("arguments[0].scrollIntoView();", button);
		
		rDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot)rDriver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File(".\\target\\facebook2.png");
		
		FileUtils.copyFile(sourceFile, destFile);
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

