package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void verifyLogin() throws Exception {
		
//		lp.enterEmail("admin@yourstore.com");
//		lp.enterPass("admin");
//		lp.clickLoginButton();
		
		
		lp.login("admin@yourstore.com", "admin");
		
		
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		lp.clickLogoutButton();
		lp.verifyApplicationTitle("Your store. Login");
	}
	

}
