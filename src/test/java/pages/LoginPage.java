package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		
//		this.driver = driver;
		
		driver = rdriver;
		
		
		
	}
	
	
	
	//Identification
	By txtEmail = By.cssSelector("input#Email");
	By txtPass = By.cssSelector("input#Password");
	By chkRem = By.id("RememberMe");
	By btnLogin = By.tagName("button");
	By btnLogout = By.partialLinkText("Logo");
	
	
	//Methods
	public void enterEmail(String email) {
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	
	public void enterPass(String pwd) {
		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pwd);
	}
	
	public void clickRemCheckbox() {
		driver.findElement(chkRem).click();;
	}
	
	public void clickLoginButton() {
		driver.findElement(btnLogin).click();;
	}
	public void clickLogoutButton() {
		
		System.out.println("=========changed===================");
		driver.findElement(btnLogout).click();;
	}
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);
		
	}
	
	
	public void login(String email, String pass) {
		
		enterEmail(email);
		enterPass(pass);
		clickLoginButton();
	}
	

}
