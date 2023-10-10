package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG8 {
	
	public WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void init(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
	
	
	@Test
	public void facebook()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		driver.findElement(By.id("email")).sendKeys("himanshu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("p@SSwOrD");
	}
	
	@Test
	public void zclose() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
