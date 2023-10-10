package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class Perjury 
{
	// Penalties for Perjury
	
	public static void acceptTerms()
	{
		M.driver.findElement(By.xpath("//label[@for='fraudAffidavitAcceptance']")).click();
	}
	
	public static void clickNext()
	{
		// !
		M.driver.findElements(By.xpath("//*[@id='mainContent']//a[contains(text(),'Next')]")).get(0).click();
	}
}
