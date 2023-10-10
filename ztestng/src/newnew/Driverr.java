package newnew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverr {
	public ChromeDriver driver;
	
	public Driverr(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginScript(String id, String pass)
	{
		driver.findElement(By.id("email")).sendKeys(id);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

}
