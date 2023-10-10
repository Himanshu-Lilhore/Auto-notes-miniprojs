// Facebook login

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	public ChromeDriver driver;
	
	@BeforeSuite
	public void display1()
	{
		System.out.println("Script is getting executed...");
	}
	
	@BeforeTest
	public void giveDriverInfo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
	}
	
	@BeforeClass
	public void open()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void navigate()
	{	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void insert()
	{
		driver.findElement(By.id("email")).sendKeys("himanshu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("paSSwOrD");
	}
	
	@AfterMethod
	public void delay() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void display2()
	{
		System.out.println("Script ended");
	}
	
//	@AfterTest
	
	@AfterSuite
	public void close()
	{
		driver.close();
	}
}
