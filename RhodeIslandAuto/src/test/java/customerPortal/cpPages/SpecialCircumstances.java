package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class SpecialCircumstances 
{
	// Special Circumstances
	
	public static void help4preminumNO()
	{
		M.driver.findElement(By.xpath("//label[@for='isHelpNeededForPayingMedicarePremiumsNO']")).click();
	}
	
	public static void help4schoolNO()
	{
		M.driver.findElement(By.xpath("//label[@for='isDisabilityRestrictedGoingToWorkOrSchoolNO']")).click();
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	}
	
	public static void clickNextSITMT()
	{
		M.driver.findElement(By.id("saveContactAndPersonalInfo")).click();
	}
}
