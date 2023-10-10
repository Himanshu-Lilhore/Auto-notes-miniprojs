package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hlilhore\\Desktop\\html\\xpath.html");
		// Absolute Xpath :
//		WebElement child1 = driver.findElement(By.xpath("html/body/input[1]"));
//		child1.sendKeys("Himanshu");
//		WebElement child2 = driver.findElement(By.xpath("html/body/input[2]"));
//		child2.sendKeys("Lilhore");
		
		// Relative Xpath :
		WebElement child1 = driver.findElement(By.xpath("//input[1]"));
		child1.sendKeys("Himanshu");
		WebElement child2 = driver.findElement(By.xpath("//input[2]"));
		child2.sendKeys("Lilhore");
	}

}
