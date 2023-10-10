package package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\hlilhore\\Desktop\\html\\first.html");
		driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();
		
//		String paddr = driver.getWindowHandle(); // parent tab
//		System.out.println(paddr);
		
		Set<String> addresses = driver.getWindowHandles();  // Parent tab and child tab
		
		for(String i : addresses)
		{
			driver.switchTo().window(i);
		}
		
		String output = driver.findElement(By.xpath("//h1[text() = 'Welcome']")).getText();
		
		System.out.println(output);
		
//		driver.switchTo().defaultContent();

	}

}
