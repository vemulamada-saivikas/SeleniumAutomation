package xpath_css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPLogin_Locator_CSS extends BaseTest{
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		Thread.sleep(2000);
		
		WebElement txt_email = driver.findElement(By.cssSelector("input[id='Email']"));
//		driver.findElement(By.xpath("//input[@id='Email']"));
		
		
		
		//validate the attribute property value
		String email_att = txt_email.getAttribute("data-val-required");
		
		System.out.println("Attribute value: " + email_att);
		Assert.assertTrue(email_att.contains("Please enter"));
		
		
		
		
		txt_email.clear();
		txt_email.sendKeys("admin@yourstore.com");
		
		
		driver.findElement(By.cssSelector("[class='password']")).clear();
		driver.findElement(By.cssSelector("[class='password']")).sendKeys("admin");
		
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		
		
		WebElement btnLogin = driver.findElement(By.cssSelector("button[type='submit']"));
		
		String btn_login_text = btnLogin.getText();
		System.out.println("login button text value are: " + btn_login_text);


		btnLogin.click();
		Thread.sleep(3000);
		
		
		System.out.println("application title after login: " + driver.getTitle()); 				//Dashboard / nopCommerce administration
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
		
		
		
		
//		driver.findElement(By.linkText("Logout"));
//		driver.findElement(By.partialLinkText("Logo"));
		
		
//		driver.findElement(By.xpath("//a[contains(text(),'Logo')]")).click();
		driver.findElement(By.cssSelector("a[href='/logout']")).click();
		
		Thread.sleep(3000);
		System.out.println("application title after logout: " + driver.getTitle()); 				//Dashboard / nopCommerce administration
		Assert.assertEquals(driver.getTitle(), "Your store. Login");
		
		
	}

}
