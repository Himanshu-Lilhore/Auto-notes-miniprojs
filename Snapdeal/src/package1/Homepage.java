package package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepage
{
	public static ChromeDriver driver;
	
	@Test
	public void toys() throws InterruptedException
	{
		// driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		
		// Searching "Outdoor Toys"
		driver.findElement(By.id("inputValEnter")).sendKeys("Outdoor Toys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Button//span[@class='searchTextSpan']")).click();

				
		// Selecting 1st item
		driver.findElements(By.xpath("//div//section//div//div//picture//img")).get(0).click();
		
		
		// Switching tab
		Set<String> addresses = driver.getWindowHandles();
		for(String i : addresses)
		{
			driver.switchTo().window(i);
		}
		
		
		// Add to cart
		driver.findElement(By.id("add-cart-button-id")).click();
		
		
		// Assertion
		String st = driver.findElement(By.xpath("//div//div[@class='cart']//span")).getText();
		Assert.assertTrue((st.charAt(0)+"").equals("1"));
		System.out.println("Verified at checkout");
		
		
		// wait and quit
		Thread.sleep(3000);
		driver.quit();
	}
	
}
