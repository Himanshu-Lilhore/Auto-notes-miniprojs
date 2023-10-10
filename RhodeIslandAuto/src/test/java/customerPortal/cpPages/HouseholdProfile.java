package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class HouseholdProfile 
{
	// Household Profile / Personal and Financial information
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
	public static void clickNext2()
	{
		// SITMT , SITNT
		M.driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div/div/a")).click();
	}
}
