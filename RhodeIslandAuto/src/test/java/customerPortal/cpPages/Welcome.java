package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class Welcome 
{
	// Welcome!
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	}
}
