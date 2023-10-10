package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hlilhore\\Desktop\\html\\demo.html");
		WebElement linkk = driver.findElement(By.linkText("Amazon"));
		linkk.click();
		driver.close();  // closes all the tabs except the child class
//		driver.quit();   // quits the browser
		
	}

}
