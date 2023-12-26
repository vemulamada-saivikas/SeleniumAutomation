package hrmTestCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import hrmPages.LoginPage;
//import pageObjectModel.LoginPage;
import utility.Constants;

public class TestBase {

	WebDriver driver;
	LoginPage lp;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		System.out.println("launching app on chrome browser, app URL " + Constants.hrmApp);
		driver.get(Constants.hrmApp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//Pages details
		lp = new LoginPage(driver);
		
		
	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(7000);
		driver.close();
		System.out.println("closing an app");

	}
	
	
	public WebDriver getWebDriver() {
		
		return this.driver;
		
	}
	
	public void captureScreenshot(String fileName) throws Exception {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File targetLocation = new File(".//screenshotFolder//"+fileName+".png"); 
		
		
		FileUtils.copyFile(screenshotFile, targetLocation);
		
	}

}
