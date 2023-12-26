package controlExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleInputbox extends BaseTest{
	
	
	@Test
	public void verifyInputbox() {
		
		
		boolean isFirstNameEnabled = driver.findElement(By.cssSelector("[name=fname]")).isEnabled();
		System.out.println("is firstname enabled: " + isFirstNameEnabled);
		
		
		//enter firstName
		driver.findElement(By.cssSelector("[name=fname]")).sendKeys("enter firstName");
		
		
		
		
		//enter lastName
		boolean islastNameEnabled = driver.findElement(By.cssSelector("[name=lname]")).isEnabled();
		System.out.println("is lastname enabled: " + islastNameEnabled);
		
		
		if(islastNameEnabled) {
			
			System.out.println("===========================");
			driver.findElement(By.cssSelector("[name=lname]")).sendKeys("enter lastName");				//element not interactable --- disabled element
		}
		
		
		
		
	}

}
