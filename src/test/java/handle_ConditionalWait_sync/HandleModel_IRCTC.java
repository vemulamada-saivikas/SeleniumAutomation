package handle_ConditionalWait_sync;

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

public class HandleModel_IRCTC {
	
	
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//implicitWait ------ all the element --- generic
		//Explicit Wait  ------ a specific element ---- specific condition
		

	}

	@AfterTest
	public void teardown() throws Exception {

//		Thread.sleep(7000);
		driver.close();
		System.out.println("closing an app");

	}
	
	
	
	
	@Test
	public void handleFrame() throws Exception {
		
		
		
		//ExplictWait;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));			//max time - before thrown an exception
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Sign')]")));
		
		
		WebElement ele_SignIn = driver.findElement(By.xpath("//span[contains(text(),'Sign')]"));
		ele_SignIn.click();
	
		//Thread.sleep(7000);
		
		

		
		
		
	}

}
