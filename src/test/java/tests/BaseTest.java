package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constants;

public class BaseTest {

	WebDriver driver;
	LoginPage lp;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get(Constants.nopComm);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//create a Page Object
		lp = new LoginPage(driver);
		
		
		
	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(7000);
		driver.close();
		System.out.println("closing an app");

	}

}
