package package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching3tabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\hlilhore\\Desktop\\html\\first.html");
		driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();
		
		
		Set<String> addresses1 = driver.getWindowHandles();  // Parent tab and child tab
		System.out.println(addresses1);
		
		for(String i : addresses1)
		{
			driver.switchTo().window(i);
		}
		
		driver.findElement(By.xpath("//a[text() = 'Click 2']")).click();
		
		Set<String> addresses2 = driver.getWindowHandles();
		System.out.println(addresses2);
		
		for(String j : addresses2)
		{
			driver.switchTo().window(j);    // this method tries to switch to only newly opened tabs
		}
		
		String output = driver.findElement(By.xpath("//h1[text() = 'Hello']")).getText();
		System.out.println(output);
		
//		String st = driver.findElement(By.cssSelector("h1")).getText();
//		System.out.println(st);

	}
}
