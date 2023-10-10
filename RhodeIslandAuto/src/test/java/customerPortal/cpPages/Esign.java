package customerPortal.cpPages;

import org.openqa.selenium.By;

import commonScripts.M;

public class Esign
{
	// Final Application Submission
	
	public static void acceptTerms()
	{
		M.driver.findElement(By.xpath("//label[@for='primaryApplicantElectronicSignature_Response']")).click();
	}
	
	public static void fillName()
	{
		M.driver.findElement(By.id("primaryApplicantElectronicSignature_firstName")).sendKeys(M.randString(6));
		M.driver.findElement(By.id("primaryApplicantElectronicSignature_lastName")).sendKeys(M.randString(6));
	}
	
	public static void submit()
	{
		M.driver.findElement(By.xpath("//*[@id='maindiv']//a[contains(text(),'SUBMIT')]")).click();
	}
}
