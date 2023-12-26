package crossBrowserExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.Constants;

public class BaseTestCrossBrowser {

	WebDriver driver;

	@Parameters("genpact_browser")
	@BeforeTest
	public void setup(String br) throws Exception {

		
		
		System.out.println("Featch parameter value from TestNG xml file: " + br);
		System.out.println("launching app on chrome browser -----using TestNG");

		String browserName = br;

		if (browserName.equalsIgnoreCase("chrome")) {

			System.out.println("execution on chrome browser");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {

			System.out.println("execution on edge browser");
			driver = new EdgeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			System.out.println("execution on firefox browser");
			driver = new FirefoxDriver();
		}

		else {

			System.out.println("execution on default browser");
			driver = new ChromeDriver();

		}

		driver.get(Constants.nopComm);
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(7000);
		driver.close();
		System.out.println("closing an app");

	}

}
