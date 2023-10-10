package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class HelpPayingForFood 
{
	// Help Paying for Food - Expedited SNAP
	
	public static void noHeatingCooling()
	{
		M.driver.findElement(By.xpath("//label[@for='heatUtilityExpenses_N']")).click();
	}
	
	public static void notMigrant()
	{
		M.driver.findElement(By.xpath("//label[@for='seasonalFarmWorker_N']")).click();
	}
	
	public static void clickNext()
	{
		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
	}
	
	public static void closePopUp() throws InterruptedException
	{
		Thread.sleep(1000);
		M.driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	}
}
