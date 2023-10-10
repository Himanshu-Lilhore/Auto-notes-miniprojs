package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class HowCanWeHelpYou 
{
	public static void iKnowNEXT()
	{
		clickIknow();
		clickNext();
	}
	
	public static void clickIknow()
	{
		M.driver.findElement(By.xpath("//label[@for='knowPrograms']")).click();
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.id("next")).click();
	}
}
