package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class IncFromOtherSrcs
{
	// Income from other sources
	
	public static void SSInoOne()
	{
		M.driver.findElement(By.xpath("//label[@for='NoOne_SS']")).click();
	}
	
	public static void RBnoOne()
	{
		M.driver.findElement(By.xpath("//label[@for='NoOne_RB']")).click();
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
}
