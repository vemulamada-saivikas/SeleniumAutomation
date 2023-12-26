package ddtExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NOPLogin_DDT_Test extends BaseTest{
	
	
	
	@Test(dataProvider = "regressionTest")
	public void verifyLoginWithDifferentuser(String genpact_email, String genpact_pwd) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys(genpact_email);
		
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys(genpact_pwd);
		
		
		
		boolean chk_Status = driver.findElement(By.xpath("//input[@name='RememberMe']")).isSelected();
		
		if(!chk_Status) {
			
			driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		}
		
		
		
		
		
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		
//		driver.getPageSource();
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"), "validation get failed with multiple user credentails!!");
	}
	
	
	
	@DataProvider
	public Object[][] smokeTest() {
		
		
		Object[][] data = { {"lakshmi@gmail.com", "welcome@123"},{"neeraj@google.com", "welcome@123"},{"vinit@yahoomail.com", "demo@123"}};
		return data;
		
	}
	
	
	@DataProvider
	public Object[][] regressionTest() {
		
		
		Object[][] data = { {"lakshmiRegression@gmail.com", "welcome@123"},{"neerajRegression@google.com", "welcome@123"},{"vinitRegression@yahoomail.com", "demo@123"} ,{"rajuRegression@yahoomail.com", "demo@123"}};
		return data;
		
	}
	
	
	
}
