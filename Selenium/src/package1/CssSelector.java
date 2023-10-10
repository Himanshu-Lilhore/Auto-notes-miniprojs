package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("himanshu@gmail.com");
//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("passWd");
		driver.findElement(By.cssSelector("input#email[data-testid = 'royal_email']")).sendKeys("himanshu@gmail.com");
		
		driver.quit();
		driver.close();
		
	}

}
