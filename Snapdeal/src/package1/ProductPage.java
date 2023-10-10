package package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPage {
	
	public static ChromeDriver driver;
	
	@Test(priority=3)
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		driver = Homepage.driver;
		
		
		
	}
	
	@Test(priority=4)
	public void assertResult() throws InterruptedException
	{
		Thread.sleep(3000);
		
	}
}
