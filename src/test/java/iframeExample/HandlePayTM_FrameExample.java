package iframeExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlePayTM_FrameExample extends BaseTest{
	
	
	@Test
	public void handleFrame() throws Exception {
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("//img[contains(@src,'login')]")).click();
		
		//nested frame
		
		//switchTo Frame
		//index
		//name or ID
		//WebElement
		
		
		
		//app1
		driver.switchTo().frame(0);
		
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[contains(@src,'oauth')]"));
		
		
		
		//app2
		//driver.switchTo().frame("oauth-iframe");
		
		//app3
		driver.switchTo().frame(innerFrame);
		
		
		Thread.sleep(4000);
		//element are inside frame
		String frameHeading =driver.findElement(By.cssSelector("div[oauth-id=\"signInTab\"]")).getText();
		System.out.println("Frame heading: " + frameHeading);
		
		Assert.assertTrue(frameHeading.contains("your Paytm account"));
		
		
		
		
		
		
		
		
	}

}
