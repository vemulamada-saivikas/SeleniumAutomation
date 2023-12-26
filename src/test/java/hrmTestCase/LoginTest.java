package hrmTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends TestBase{
	
	@Test
	public void verifyLogin() throws Exception {
		
//		Assert.assertEquals(driver.getTitle(), "Your store. Login");
		
		lp.enterEmail("Admin");
		
//		Thread.sleep(2000);
//		
//		lp.enterOnEmail("admin@yourstore.com");
		
		lp.enterPass("admin123");
		
		
		lp.clickLoginButton();
		
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		lp.clickUserDropDown();
		lp.clickLogoutButton();
		
		
		
		
	}

}
