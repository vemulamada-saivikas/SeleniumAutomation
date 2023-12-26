package javascriptExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class RegistrationPage {
	
	
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(7000);
		driver.close();
		System.out.println("closing an app");

	}
	
	
	
	
	@Test
	public void handleFrame() throws Exception {
//		Thread.sleep(15000);
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
//		
//		
//
//		WebElement lastName_disabled = driver.findElement(By.cssSelector("[name=lname]"));
//		
////		lastName_disabled.sendKeys("enter value into textbox");
//		
////		JS.executeScript("alert('hello everyone, happy learning!!')");
//		
//		JS.executeScript("arguments[0].value='enter lastName'", lastName_disabled);
		
		
		WebElement btn_Submit = driver.findElement(By.cssSelector("#submit"));
//		btn_Submit.click();
		
		JS.executeScript("arguments[0].click()", btn_Submit);
		
	}
	
	


}
