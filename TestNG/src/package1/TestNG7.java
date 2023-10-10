package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG7 {
	
	@DataProvider(name = "firstdataprovider")
	public Object[][] launch()
	{
		Object data[][] =
			{
					{"himanshu@gmail.com", "p@SSwOrD"},
					{"randomname@gmail.com", "Conf3r3nc3"},
					{"otherid@gmail.com", "Dispos@ble"},
					{"testemail@gmail.com", "newPaS$"}
			};
		return data;
	}
	
	@Test(dataProvider = "firstdataprovider")
	public void facebook(String emaile, String passwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		driver.findElement(By.id("email")).sendKeys(emaile);
		driver.findElement(By.id("pass")).sendKeys(passwd);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
