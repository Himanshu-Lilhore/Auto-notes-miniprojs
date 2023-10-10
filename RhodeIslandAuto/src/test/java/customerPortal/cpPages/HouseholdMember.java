package customerPortal.cpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class HouseholdMember
{
	// Household Member
	
	public static WebElement dropDown;
	public static Select s;
	
	public static void veteranNO()
	{
		M.driver.findElement(By.xpath("//label[@for='spouseOfDeceasedVeteran_N']")).click();
		M.driver.findElement(By.xpath("//label[@for='childOfDeceasedVeteran_N']")).click();
	}
	
	public static void selectMaritalStatus()
	{
		dropDown = M.driver.findElement(By.id("maritalStatus"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText("Single-Never Married");
	}
	
	public static void migrantNO()
	{
		M.driver.findElement(By.xpath("//label[@for='migrantWorker_N']")).click();
		M.driver.findElement(By.xpath("//label[@for='migrantFarmWorker_N']")).click();
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
}
