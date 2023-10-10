package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class NoEditsScreen
{
//	0
	// Application Overview
	// Acknowledgement of Responsibilities and Authorized Representative
	// Applicant Information
	// Household Member Summary
	// Household Membership Summary
	// Job & Income Information
	// Employment Details
	// Job income summary
	// Other income summary
	// Housing and Utility expenses
	// Housing expense summary
	// Your Other Expenses
	// Other Expense Summary
	// Submit Human services application
	
//	1
	// Welcome!
	
//	2
	// Application Review
	
//	3
	// Application Household Information
	// Household member final Questions

//	4
	// Additional Information
	// Pre-Application submission
	// 
	
//  5
	// You have no additional questions to answer in this section
	// Identifying Your authorized representative
	
	
	public static void NEXT(int maxTime) throws InterruptedException
	{
		M.myDoer = NoEditsScreen::NEXTinternal;
		M.loopTry(maxTime);
	}
	
	public static void NEXT()
	{
		NEXTinternal();
	}
	
	
	public static void NEXTinternal()
	{
		try 
		{
		    clickNext();
		}
		catch (Exception e)
		{
			try 
			{
			    clickNext1();
			}
			catch (Exception e1)
			{
				try 
				{
				    clickNext2();
				}
				catch (Exception e2)
				{
					try 
					{
					    clickNext3();
					}
					catch (Exception e3)
					{
						try 
						{
						    clickNext4();
						}
						catch (Exception e4)
						{
							try 
							{
							    clickNext5();
							}
							catch (Exception e5)
							{
								System.out.println("NEW Next button xpath present here OR timed out");
							}
						}
					}
				}
			}
		}
	}
	
	
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
	public static void clickNext1()
	{
		M.driver.findElement(By.xpath("//Button[contains(text(),'Next')]")).click();
	}
	
	public static void clickNext2()
	{
		// !
		M.driver.findElement(By.id("applicationReviewForm_Redirect")).click();
	}
	
	public static void clickNext3()
	{
		M.driver.findElements(By.xpath("//*[@id='mainContent']//a[contains(text(),'Next')]")).get(0).click();
	}
	
	public static void clickNext4()
	{
		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
	}
	
	public static void clickNext5()
	{
		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(1).click();
	}

}
