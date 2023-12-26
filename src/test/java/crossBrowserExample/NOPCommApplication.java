package crossBrowserExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPCommApplication extends BaseTestCrossBrowser {

	@Test
	public void verifyLogin() throws Exception {

		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");

		driver.findElement(By.cssSelector("input#RememberMe")).click();
		driver.findElement(By.tagName("button")).click();

		Thread.sleep(4000);
		System.out.println("application title after login: "+ driver.getTitle());
		
		driver.findElement(By.partialLinkText("Logout")).click();
		
		Thread.sleep(4000);
		System.out.println("application title after logout: "+ driver.getTitle());
		
	}

}
