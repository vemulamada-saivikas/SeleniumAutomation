package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class AmazonApp {
	
	
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
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
		
		Thread.sleep(4000);

//		driver.findElement(By.className("email valid")).sendKeys("anything");

//		driver.findElement(By.className("email")).sendKeys("anything");
		driver.findElement(By.cssSelector("input.email")).sendKeys("anything");
		
	}

}
