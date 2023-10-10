package customerPortal.cpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class SelfEmpDetails
{
	// Self-Employment Details
	
	public static WebElement dropDown;
	public static Select s;
			
	public static void empTypeOTHERS()
	{
		dropDown = M.driver.findElement(By.id("selfEmploymentType_typeCd"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText("Other Self Employment");
	}
	
	public static void selectPayDate()
	{
		M.driver.findElement(By.xpath("//*[@id='pay-detailsSection']//img")).click();
		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
	}
	
	public static void enterGrossPay(Integer num)
	{
		M.driver.findElement(By.xpath("//input[contains(@id,'payDetails_GrossAmount')]")).sendKeys(num.toString());
	}
	
	public static void payMtdCASH()
	{
		dropDown = M.driver.findElement(By.xpath("//select[contains(@id,'payDetails_PayMethod')]"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText("Cash/Check");
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
}
