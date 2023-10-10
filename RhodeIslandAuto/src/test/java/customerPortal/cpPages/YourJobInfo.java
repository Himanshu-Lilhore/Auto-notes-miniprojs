package customerPortal.cpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class YourJobInfo
{
	// Your Information - Current Job and Income
	
	public static WebElement dropDown;
	public static Select s;
	
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	}
	
	public static void empIncomeYES()
	{
		M.driver.findElement(By.xpath("//label[@for='isEmployedquestionYES']")).click();
	}
	
	public static void workAsEmployeeYES()
	{
		M.driver.findElement(By.xpath("//label[@for='empSectionIdYES']")).click();
	}
	
	public static void clickSearch() throws InterruptedException
	{
		M.driver.findElement(By.xpath("//div[@id='employer-information']//button[contains(text(),'Search')]")).click();
		Thread.sleep(1000);
	}
	
	public static void enterEmployerName()
	{
		M.driver.findElement(By.id("employerNameSearch")).sendKeys("tyu");
	}
	
	public static void enterZipCode()
	{
		M.driver.findElement(By.id("zip")).sendKeys("02901");
	}
	
	public static void searchEmployers() throws InterruptedException
	{
		M.driver.findElement(By.id("searchPopupBtn")).click();
	}
	
	public static void selectFirstEmp() throws InterruptedException
	{
		M.myDoer = YourJobInfo::selectFirstEmpInternal;
		M.loopTry(10000);   // waiting for the list to generate
	}
	
	public static void selectEmpBtn() throws InterruptedException
	{
		M.driver.findElement(By.xpath("//a[contains(text(),'Select Employer')]")).click();
		Thread.sleep(2500);
	}
	
	public static void selectPayReciDate()
	{
		M.driver.findElements(By.xpath("//*[@id='employer-information']//img")).get(0).click();
		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
	}
	
	public static void fillWage(Integer num)
	{
		M.driver.findElement(By.xpath("//div[contains(@class,'empWagesCalc')]//input[contains(@id,'wagesTips')]")).sendKeys(num.toString());
	}
	
	public static void selectWageFreq()
	{
		dropDown = M.driver.findElement(By.xpath("//select[contains(@id,'wagesFrequency')]"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText("Monthly");
	}
	
	public static void fillHrsWorked(Integer num)
	{
		M.driver.findElement(By.xpath("//input[contains(@id,'averageHoursNew')]")).sendKeys(num.toString());
	}
	
	public static void selfEmpYES()
	{
		M.driver.findElement(By.xpath("//label[@for='isSelfEmployedYES']")).click();
	}
	
	public static void typeOfWork()
	{
		M.driver.findElement(By.xpath("//input[contains(@id,'typeOfWork')]")).sendKeys("Others");
	}
	
	public static void selfEmpInc(Integer num)
	{
		M.driver.findElement(By.xpath("//input[contains(@id,'netIncome')]")).sendKeys(num.toString());
	}
	
	public static void selfEmpReciDate()
	{
		M.driver.findElements(By.xpath("//*[@id='selfEmpSec']//img")).get(0).click();
		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
	}
	
	public static void selectFirstEmpInternal()
	{
		M.driver.findElements(By.xpath("//table//input")).get(0).click();
	}
}
