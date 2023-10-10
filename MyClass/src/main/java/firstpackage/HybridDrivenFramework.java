package firstpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HybridDrivenFramework {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\hlilhore\\eclipse-workspace\\MyClass\\src\\test\\java\\secondpackage\\hybrid.properties");
		
		Properties p = new Properties();
		p.load(fis);
		
		String myEmail = p.getProperty("e");
		String myPassword = p.getProperty("p");
		String emailLocator = p.getProperty("el");
		String passwordLocator = p.getProperty("pl");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id(emailLocator)).sendKeys(myEmail);
		driver.findElement(By.id(passwordLocator)).sendKeys(myPassword);

	}

}
