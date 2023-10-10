package customerPortal.cpPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import commonScripts.M;

public class Dashboard
{
	public static void getCaseNo(int maxTime) throws InterruptedException
	{
		M.myDoer = Dashboard::getCaseNoInternal;
		M.loopTry(maxTime);
	}
	
	public static void getCaseNoInternal()
	{
		String caseNo = M.driver.findElement(By.xpath("//div[contains(text(),'#')]")).getText();
		caseNo = caseNo.substring(1, caseNo.length());
		M.dataMap.put("caseNo", caseNo);
		System.out.println(caseNo);
	}
	
	public static void getCaseNoWithSS(int maxTime) throws InterruptedException
	{
		M.myDoer = Dashboard::getCaseNoWithSSInternal;
		M.loopTry(maxTime);
	}
	
	public static void getCaseNoWithSSInternal()
	{
		WebElement wb = M.driver.findElement(By.xpath("//div[contains(text(),'#')]"));
		String caseNo = wb.getText();
		caseNo = caseNo.substring(1, caseNo.length());
		M.dataMap.put("caseNo", caseNo);
		System.out.println(caseNo);
		
		try 
		{
			M.takeScreenshot(wb);
		} 
		catch (IOException | InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
