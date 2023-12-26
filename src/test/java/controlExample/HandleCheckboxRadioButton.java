package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckboxRadioButton extends BaseTest {

	
	
	@Test
	public void verifyRadioButton() throws Exception {
		
		Thread.sleep(3000);
		
		System.out.println("==================verifyRadioButton========================");
		WebElement radio_female = driver.findElement(By.cssSelector("input[value='female']"));
		radio_female.click();

	}
	
	
	@Test
	public void verifyCheckbox() {
		
		System.out.println("==================verifyCheckbox========================");
		
		WebElement chk_bike = driver.findElement(By.cssSelector("input[value='Bike']"));
		
		
		System.out.println("============before click on checkbox=============" + chk_bike.isSelected());
		
		chk_bike.click();
		
		System.out.println("===========after click on checkbox===============" + chk_bike.isSelected());

	}

	

}
