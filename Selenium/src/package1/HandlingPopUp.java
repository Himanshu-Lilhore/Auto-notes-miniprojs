package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/javascript4.htm");
		
		
//		accept -> OK
//		dismiss -> cancel
		
		// Alert pop-up :
		driver.findElement(By.name("B1")).click();
		
		Alert anotherDriver = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		anotherDriver.accept();
		
		
		// Confirm pop-up :
		driver.findElement(By.name("B2")).click();
		
		anotherDriver = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		anotherDriver.dismiss();
		
		
		// Prompt pop-up :
		driver.findElement(By.name("B3")).click();
		
		anotherDriver = driver.switchTo().alert();
		anotherDriver.sendKeys("Himanshu");
		
		Thread.sleep(3000);
		
		anotherDriver.accept();

	}

}
