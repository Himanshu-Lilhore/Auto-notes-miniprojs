package workerPortal.wpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class NavBar 
{
	public static void visitRecord()
	{
		M.driver.findElement(By.id("RLTOP")).click();
	}
	
	public static void applicationRegistration(String subTab)
	{
		M.driver.findElement(By.id("ARTOP")).click();
		subTab = subTab.toLowerCase().replace(" ", "");
		
		switch(subTab)
		{
		case "register": case "registerapplication": default:
			M.driver.findElement(By.id("AREGA")).click();
			break;
		case "maintain": case "maintainapplication":
			M.driver.findElement(By.id("ARSEA")).click();
			break;
		case "expedited": case "expeditedscreen":
			M.driver.findElement(By.id("ARMEE")).click();
			break;
		}
	}
	
	public static void scheduling()
	{
		M.driver.findElement(By.id("SHTOP")).click();
	}
	
	public static void dataCollection()
	{
		M.driver.findElement(By.id("DCTOP")).click();
	}
	
	public static void enrollment()
	{
		M.driver.findElement(By.id("ENTOP")).click();
	}
	
	public static void others()
	{
		/// HOVER here not click
//		M.driver.findElement(By.id("othersImage")).click();
	}
	
	public static void otherDynamicTabs()
	{
		M.driver.findElement(By.id("OthersTopNav")).click();
	}
	
}
