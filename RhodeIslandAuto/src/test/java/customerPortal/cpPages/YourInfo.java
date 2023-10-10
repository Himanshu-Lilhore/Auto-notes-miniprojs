package customerPortal.cpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class YourInfo 
{
	
	// Your Information
	
	public static WebElement dropDown, cityWeb;
	public static Select s;
	public static String myCity;
	public static String myPin;
	public static boolean isResidence;    // true - residence, false - mailing
	public static int myTime;     // timeout for finding that element
	
	public static void howManyPeople(Integer num)
	{
		M.driver.findElement(By.id("householdSize")).sendKeys(num.toString());
	}
	
	public static void clickNext()
	{
		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	}
	
	public static void clickNext2()
	{
		M.driver.findElement(By.id("saveContactAndPersonalInfo")).click();
	}
	
	public static void genderMale()
	{
		M.driver.findElement(By.xpath("//label[@for='gender1MALE']")).click();
	}
	
	public static void humanServProgYES()
	{
		M.driver.findElements(By.xpath("//label[contains(text(),'Yes')]")).get(0).click();
	}
	
	public static void snapYES()
	{
		M.driver.findElements(By.xpath("//label[contains(text(),'Yes')]")).get(1).click();
	}
	
	public static void selectMtdOfCont()
	{
		dropDown = M.driver.findElement(By.id("preferredMethodContact"));
		dropDown.click();
		s = new Select(dropDown);
		s.selectByIndex(1);     // index 1 - email
	}
	
	public static void enterEmail()
	{
		M.driver.findElement(By.id("email")).sendKeys(M.randString(7) + "@gmail.com");
	}
	
	public static void sameMailingAddYES()
	{
		M.driver.findElement(By.xpath("//label[@for='isMailingAndHomeAddressSameYES']")).click();
	}
	
	public static void sameMailingAddNO()
	{
		M.driver.findElement(By.xpath("//label[@for='isMailingAndHomeAddressSameNO']")).click();
	}
	
	public static void incarceratedNo()
	{
		M.driver.findElement(By.xpath("//label[@for='isIncarceratedNO']")).click();
	}

	public static void UScitizenYES()
	{
		M.driver.findElement(By.xpath("//label[@for='isUSCitizenYES']")).click();
	}
	
	public static void veteranNO()
	{
		M.driver.findElement(By.xpath("//label[@for='honourablyDischargedNO']")).click();
	}
	
	public static void enterMailingAdd()
	{
		M.driver.findElement(By.id("mailingAddressLineOne")).sendKeys(M.randString(5));
	}
	
	public static void enterResAdd()
	{
		M.driver.findElement(By.id("addressLineOne")).sendKeys(M.randString(5));
	}
	
	public static void enterResCity(String city, String pin, int maxTime) throws InterruptedException
	{
		// isResidence ---> true - residence, false - mailing
		myCity = city;
		myPin = pin;
		myTime = maxTime;
		isResidence = true;
		enterCityInternal();
	}
	
	public static void enterMailCity(String city, String pin, int maxTime) throws InterruptedException
	{
		// isResidence ---> true - residence, false - mailing
		myCity = city;
		myPin = pin;
		myTime = maxTime;
		isResidence = false;
		enterCityInternal();
	}
	
	
	public static void enterCityInternal() throws InterruptedException
	{
		if(isResidence)
			cityWeb = M.driver.findElement(By.id("homeCity"));
		else
			cityWeb = M.driver.findElement(By.id("mailingCity"));
		
		cityWeb.sendKeys(myCity);
		M.myDoer = YourInfo::selectPinInternal;
		M.loopTry(myTime);
	}
	
	public static void selectPinInternal()
	{
		M.driver.findElement(By.xpath("//ul/li/a[text()='PROVIDENCE - " + myPin + "']")).click();
	}
}
