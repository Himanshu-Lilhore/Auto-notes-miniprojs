package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third
{
	ChromeDriver info;
	
	public Third(ChromeDriver info)
	{
		this.info = info;
	}
	
	public void clickChargers()
	{
		info.findElement(By.linkText("Chargers")).click();
	}
}
