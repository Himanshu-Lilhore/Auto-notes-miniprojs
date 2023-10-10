package pageObjectModelRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.First;
import pageObjectModel.Second;
import pageObjectModel.Third;

public class PageObjectModel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		First f = new First(driver);
		f.clickMobiles();
		
		Second s = new Second(driver);
		s.clickAccessories();
		
		Third t = new Third(driver);
		t.clickChargers();
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
