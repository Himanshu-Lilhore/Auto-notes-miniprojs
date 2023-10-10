package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class SelectPrograms
{
	// Select the programs you are interested in below.
	
	public static void selectSNAP()
	{
		M.driver.findElement(By.xpath("//label[@for='snapReq']")).click();
		M.dataMap.put("program", "SNAP");
	}
	
	public static void selectCCAP()
	{
		M.driver.findElement(By.xpath("//label[@for='childCareReq']")).click();
		M.dataMap.put("program", "CCAP");
	}
	
	public static void selectHIX()
	{
		M.driver.findElement(By.xpath("//label[@for='hixReq']")).click();
		M.dataMap.put("program", "HIX");
	}
	
	public static void selectRIW()
	{
		M.driver.findElement(By.xpath("//label[@for='tempCashAssisReq']")).click();
		M.dataMap.put("program", "RIW");
	}
	
	public static void clickNEXT()
	{
		M.driver.findElement(By.id("submitAction")).click();
	}

}
