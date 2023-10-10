package package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabAtWill {

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
		
		String one = "", two = "", three = "";
		
		int count = 0;
		for(String j : addresses2)
		{
			if(count == 0)
				one = j;
			else if(count == 1)
				two = j;
			else
				three = j;
			count++;
//			driver.switchTo().window(j);    // this method tries to switch to only newly opened tabs
		}
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		driver.switchTo().window(one);
		String st = driver.findElement(By.cssSelector("a")).getText();
		System.out.println(st);
		
		driver.switchTo().window(two);
		String st2 = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(st2);
		
		driver.switchTo().window(three);
		String st3 = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(st3);
		
//		String output = driver.findElement(By.xpath("//h1[text() = 'Hello']")).getText();
//		System.out.println(output);
		
//		String st = driver.findElement(By.cssSelector("a")).getText();
//		System.out.println(st);
//		
//		driver.switchTo().defaultContent();

	}
}
