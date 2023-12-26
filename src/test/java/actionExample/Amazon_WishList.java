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

public class Amazon_WishList {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get(Constants.amazonapp);
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
	public void verifyWishListTest() {
		
		
		WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign')]"));
		//SignIn.click();
		WebElement wishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		
		//Action Example
		
		Actions act = new Actions(driver);
		
		
		
//		//app1
//		//act.moveToElement(SignIn)
//		act.moveToElement(SignIn).perform();
//		act.moveToElement(wishList).perform();
//		act.click().perform();
		
		
		
//		//app2 ---- method chaining
////		act.moveToElement(SignIn).moveToElement(wishList).click().build().perform();
//		act.moveToElement(SignIn).moveToElement(wishList).click().perform();
		
		
		
//		//app3 ---- method chaining
//		act.moveToElement(SignIn).click(wishList).perform();

		
//		//app4
		//act.moveToElement(SignIn)
		act.moveToElement(SignIn).perform();
		wishList.click();
		
//		
//		wishList.click();
		
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Wish"));
		
	}
}
