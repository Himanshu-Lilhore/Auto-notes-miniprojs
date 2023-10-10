package newnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mm {
	public ChromeDriver driver;
	
	@DataProvider(name = "users")
	public String[][] data()
	{
		String[][] dd =
				{
						{"abc@gmail.com","aBc"},
						{"xyz@gmail.com", "xYz"}
				};
		
		return dd;
	}
	
	@BeforeSuite
	public void realAction()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void driverSetup()
	{
		driver.get("https://www.fb.com");
	}
	
	@Test(dataProvider = "users")
	public void willLoop(String[] user) throws InterruptedException
	{
		driverSetup();
		Driverr lg = new Driverr(driver);
		lg.loginScript(user[0], user[1]);
		Thread.sleep(2000);
	}
	
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
	
}
