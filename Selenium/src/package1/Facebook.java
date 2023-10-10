package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.id("identify_email")).sendKeys("himanshu@gmail.com");
		driver.findElement(By.id("did_submit")).click();
		
		driver.close();
	}

}
