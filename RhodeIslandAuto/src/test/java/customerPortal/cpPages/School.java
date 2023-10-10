package customerPortal.cpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class School
{
	// School Enrollment Details
	
	public static WebElement dropDown;
	public static Select s;
	
	public static void unknownSchool()
	{
		M.driver.findElement(By.xpath("//label[@for='schoolTime_UK']")).click();
	}
	
	public static void highestUnknown()
	{
		dropDown = M.driver.findElement(By.id("highestGradeInSchool"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText("Unknown");
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
}
