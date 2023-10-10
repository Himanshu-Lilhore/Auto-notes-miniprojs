package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class ApplicationOverview 
{
	// Application Overview
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
}
