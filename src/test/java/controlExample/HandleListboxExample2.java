package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleListboxExample2 extends BaseTest{
	
	
	@Test
	public void verifyCountryListboxTest() throws Exception {
		
		
		
		driver.findElement(By.cssSelector("option[value='India']")).click();
		
		
		
		
	}
	
	
	
	@Test
	public void verifyCarListboxTest() throws Exception {
		
		driver.findElement(By.cssSelector("option[value='Singapore']")).click();
		
		
	}

}
