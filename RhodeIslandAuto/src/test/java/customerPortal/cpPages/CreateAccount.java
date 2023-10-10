package customerPortal.cpPages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class CreateAccount
{
	public static String fname;
	public static Random rand = new Random();
	public static WebElement dropDown;
	public static Select s;
	
	public static void fillNameAdd() 
	{
		fname = 'A' + M.randString(6);
		String lname = M.randString(6);
		M.driver.findElement(By.id("fname")).sendKeys(fname);
		M.driver.findElement(By.id("lname")).sendKeys(lname);
		M.driver.findElement(By.id("address1")).sendKeys(M.randString(8));
		
		M.dataMap.put("fname", fname);
		M.dataMap.put("lname", lname);
	}
	
	public static void fillCity() throws InterruptedException
	{
		WebElement city = M.driver.findElement(By.id("city"));
		city.sendKeys("Providence");
		Thread.sleep(2000);
		M.driver.findElement(By.xpath("//div[@id='cityzipmenu']/ul/li/a[text()='PROVIDENCE - 02901']")).click();
	}
	
	public static void fillSSN()
	{
        String ssn = '8' + ((Integer)rand.nextInt(10000000, 99999999)).toString();
		M.driver.findElement(By.id("ssn")).sendKeys(ssn);
		M.driver.findElement(By.id("reenterssn")).sendKeys(ssn);
		
		M.dataMap.put("ssn", ssn);
	}
	
	public static void fillSSNwithSS() throws IOException, InterruptedException
	{
		WebElement wb = M.driver.findElement(By.id("ssn"));
		M.takeScreenshot(wb);
		
		// Screenshot code
//		Thread.sleep(2000);////////////////
//		((JavascriptExecutor)M.driver).executeScript("arguments[0].scrollIntoView(true);", wb);
//		Long height = (Long)((JavascriptExecutor)M.driver).executeScript("return window.scrollY;");
//		System.out.println(height);
//		((JavascriptExecutor)M.driver).executeScript("scroll(0, " + (height-150) + ");");
	}
	
	public static void fillDOB()
	{
		// Generating DOB
		String year = ((Integer)rand.nextInt(1975, 1998)).toString();
		String day = ((Integer)rand.nextInt(1, 28)).toString();
		Integer month = rand.nextInt(0, 11);
		
		
		// Filling DOB :
		M.driver.findElements(By.xpath("//img[contains(@class,'icon-calendar')]")).get(0).click();
		dropDown = M.driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText(year);
		dropDown = M.driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByIndex(month);
		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + day + "']")).click();
		
		
		// Reenter DOB :
		M.driver.findElements(By.xpath("//img[contains(@class,'icon-calendar')]")).get(1).click();
		dropDown = M.driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByVisibleText(year);
		dropDown = M.driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByIndex(month);
		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + day + "']")).click();
		
		M.dataMap.put("dob", ((Integer)(month+1)).toString() + "/" + day + "/" + year + "  [mm/dd/yyyy]");
	}
	
	public static void clickSubmit()
	{
		M.driver.findElement(By.id("SubmitButtonForPersonInfo")).click();
	}
	
	public static void fillSecQue()
	{
		dropDown = M.driver.findElement(By.id("secques1"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByIndex(1);
		
		dropDown = M.driver.findElement(By.id("secques2"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByIndex(2);
		
		dropDown = M.driver.findElement(By.id("secques3"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByIndex(3);
	}
	
	public static void fillSecAns()
	{
		M.driver.findElement(By.id("secans1")).sendKeys(fname + "1");
		M.driver.findElement(By.id("secans2")).sendKeys(fname + "2");
		M.driver.findElement(By.id("secans3")).sendKeys(fname + "3");
	}
	
	public static void fillUserPass()
	{
		// Generation :
		M.username = fname + M.date;
		M.password = "Password@1";
		M.dataMap.put("username", M.username);
		M.dataMap.put("password", M.password);
		System.out.println(M.username);
		System.out.println(M.password);
		
		
		// Filling user-name & pass :
		M.driver.findElement(By.id("userName")).sendKeys(M.username);
		M.driver.findElement(By.id("password")).sendKeys(M.password);
		M.driver.findElement(By.id("reenterPassword")).sendKeys(M.password);
	}
	
	public static void tickTnC()
	{
		M.driver.findElement(By.xpath("//label[@for='rightsAndResponsibilites']")).click();
		M.driver.findElement(By.xpath("//label[@for='agreement']")).click();
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.id("registrationNextButton")).click();
	}
}
