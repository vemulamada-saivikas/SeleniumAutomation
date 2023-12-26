package modelExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleModel_IRCTC extends BaseTest{
	
	
	@Test
	public void handleFrame() throws Exception {
		
		//nested frame
		
		//switchTo Frame
		//index
		//name or ID
		//WebElement
		
		
		
		WebElement ele_ContactUS = driver.findElement(By.partialLinkText("CONTACT US"));
		
		ele_ContactUS.click();
	
		Thread.sleep(7000);
		
		
		
		String dialog_title = driver.findElement(By.id("ui-dialog-5-label")).getText();
		
		System.out.println("Contact US dialog title: " + dialog_title);
		
		
		
	}

}
