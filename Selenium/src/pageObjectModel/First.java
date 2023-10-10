package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class First
{
	ChromeDriver info;
	
	public First(ChromeDriver info)
	{
		this.info = info;
	}
	
	public void clickMobiles()
	{
		info.findElement(By.linkText("Mobiles")).click();
	}
}
