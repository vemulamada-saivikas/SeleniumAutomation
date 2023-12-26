package actionExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class RightClick_DoubleClickTest {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get(Constants.actionExampleApp);
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
	public void verifyRightClick() {
		
		
		WebElement btn_RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement btn_DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		
		Actions act = new Actions(driver);

		//right click operation ---- contextClick()
		//app1
		//act.contextClick(btn_RightClick).perform();
		
		
		
		//app2
		act.moveToElement(btn_RightClick).contextClick().perform();
		
		
		
		
		
	}
	
	
	@Test
	public void verifyDoubleClick() throws Exception {
		
		
		WebElement btn_RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement btn_DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		
		Actions act = new Actions(driver);

		//double click operation ---- doubleClick()
		
		act.doubleClick(btn_DoubleClick).perform();
		
		
		
		String AlertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text Double click : " + AlertText);
		
		
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		
		
	}
}
