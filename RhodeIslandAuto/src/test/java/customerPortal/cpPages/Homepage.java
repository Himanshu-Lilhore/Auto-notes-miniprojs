package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class Homepage 
{
	public static void gotoLoginPage() throws InterruptedException
	{
		LoginOrCreateAcc.contToSitePopUp();
		
		M.driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
		LoginOrCreateAcc.contToSitePopUp();
	}
}
