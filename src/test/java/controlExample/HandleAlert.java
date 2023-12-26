package controlExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends BaseTest{
	
	
	//@Test
	public void verifySimpleALert() throws InterruptedException {
		
		
		//click on Show me Alert button to generate an alert
		driver.findElement(By.cssSelector("[value='Show Me Alert']")).click();
		
		
		
		
		//Alert/iframe/windows ------- driver.switchTo()


		
		
		//Alert
		//accept  ---- ok button
		//dismiss ---- cancel
		//getText ---- get the text of alert
		//SendKeys ---- send the keys to Alert inputbox
		
		
		Alert SimpleLAlert = driver.switchTo().alert();
		
		
		
		//handle an alert
		System.out.println("Alert Text: " + SimpleLAlert.getText());
		
		Thread.sleep(5000);
		
//		driver.switchTo().alert().accept();
		SimpleLAlert.dismiss();
		
		
		
		Assert.assertTrue(SimpleLAlert.getText().contains("alert message!"));
		
		
		
	}
	
	
	
	
	//@Test
	public void verifyConfirmALert() throws InterruptedException {
		
		
		//click on Show me Alert button to generate an alert
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		
		
		
		
		//Alert/iframe/windows ------- driver.switchTo()


		
		
		//Alert
		//accept  ---- ok button
		//dismiss ---- cancel
		//getText ---- get the text of alert
		//SendKeys ---- send the keys to Alert inputbox
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		
		//handle an alert
		System.out.println("Confirm Alert Text: " + confirmAlert.getText());
		
		Thread.sleep(5000);
		
		
		Assert.assertTrue(confirmAlert.getText().contains("Press 'OK' or 'Cancel' button!"));
		
		
		
		//accept and dismiss

		confirmAlert.accept();
//		confirmAlert.dismiss();
		
		
		
		String ok_cancel_text = driver.findElement(By.id("demo")).getText();
		
		System.out.println("=========validation=============" + ok_cancel_text);
		
//		Assert.assertTrue(ok_cancel_text.contains("OK"));
		Assert.assertTrue(ok_cancel_text.contains("OK"), "error message: validation get failed of alert!!");
		
		
	}

	
	@Test
	public void verifyPromptALert() throws InterruptedException {
		
		
		//click on Show me Alert button to generate an alert
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		
		
		
		
		//Alert/iframe/windows ------- driver.switchTo()


		
		
		//Alert
		//accept  ---- ok button
		//dismiss ---- cancel
		//getText ---- get the text of alert
		//SendKeys ---- send the keys to Alert inputbox
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		//handle an alert
		System.out.println("Prompt Alert Text: " + promptAlert.getText());
		
		Thread.sleep(5000);
		
		
		Assert.assertTrue(promptAlert.getText().contains("Your Name Please"));				//Your Name Please
		
		Thread.sleep(5000);
		//enter value onto alert
		promptAlert.sendKeys("Sanjeev StripData");
		
		
		
		
		//accept and dismiss

//		promptAlert.accept();
		promptAlert.dismiss();
		
		
		
		
		
	}
	
	
	
	
}
