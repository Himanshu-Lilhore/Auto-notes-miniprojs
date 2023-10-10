package customerPortal.cpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonScripts.M;

public class LoginOrCreateAcc 
{
	public static void contToSitePopUp() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement popUp = M.driver.findElement(By.xpath("//span[text()='Close and Continue to Site']"));
		if(popUp.isDisplayed())
			popUp.click();
	}
	
	public static void fillDetails()
	{
		M.driver.findElement(By.id("username")).sendKeys(M.dataMap.get("username"));		
		M.driver.findElement(By.id("password")).sendKeys(M.dataMap.get("password"));
	}
	
	public static void clickLogin()
	{
		M.driver.findElement(By.id("submit-button-pkmsForm")).click();
	}
	
	public static void clickCreateAcc()
	{
		M.driver.findElement(By.xpath("//a[text()=' Create account.']")).click();
	}
	
	public static void dontCheckExisting()
	{
		M.driver.findElement(By.xpath("//span[text()='I don’t want to check for an existing account at this time.']")).click();
		M.driver.findElement(By.id("continueBtn")).click();
	}
}
