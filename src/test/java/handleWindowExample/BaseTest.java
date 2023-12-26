package handleWindowExample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constants;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get(Constants.irctcApp);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(7000);
		driver.close();      //current focus window
		
		driver.quit();		//close all the window launched by driver instance
		System.out.println("closing an app");

	}

}
