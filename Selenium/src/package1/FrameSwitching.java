package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\hlilhore\\Desktop\\html\\frame1.html");
		
		driver.findElement(By.id("fname")).sendKeys("Chandler");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("mname")).sendKeys("Muriel");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("lname")).sendKeys("Bing");
		

	}

}
