// multiple @Test annotation and @BeforeMethod, @AfterMethod annotations

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG3 {
	
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Test Priority 1");
	}
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("Test Priority 2");
	}
	
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("Test Priority 3");
	}
	
	@BeforeTest
	public void befTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void befMethod()
	{	
		System.out.println("Before Method");
	}
	
	@AfterTest
	public void afTest()
	{
		System.out.println("After Test");
	}
	
	@AfterClass
	public void afClass()
	{
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void afMethod()
	{	
		System.out.println("After Method");
	}
}