package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second
{
	ChromeDriver info;
	
	public Second(ChromeDriver info)
	{
		this.info = info;
	}
	
	public void clickAccessories()
	{
		info.findElement(By.linkText("Mobile Accessories")).click();
	}
}
