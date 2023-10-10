package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeystrokesAndMouseUsingScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions a = new Actions(driver);
		
		
		// Typing APPLE :
		a.moveToElement(box).click()
		.keyDown(Keys.SHIFT).sendKeys("apple")
		.keyUp(Keys.SHIFT)
		.pause(3000)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.perform();
		
		
		// Typing APPLE -> removing it -> typing LENOVO -> Enter
		a.moveToElement(box).click()
		.keyDown(Keys.SHIFT).sendKeys("apple")
		.keyUp(Keys.SHIFT)
		.pause(3000)
		.keyDown(Keys.LEFT_CONTROL)
		.sendKeys("a")
		.keyUp(Keys.LEFT_CONTROL)
		.keyDown(Keys.BACK_SPACE)
		.pause(1000)
		.keyUp(Keys.BACK_SPACE)
		.keyDown(Keys.SHIFT).sendKeys("lenovo")
		.keyUp(Keys.SHIFT)
		.pause(3000)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.perform();
		
		
		// right click:
		driver.get("http://omayo.blogspot.com/");
		WebElement rytClick = driver.findElement(By.id("testdoubleclick"));
		Actions rc = new Actions(driver);
		rc.moveToElement(rytClick).contextClick().perform();
		
		
		// double click
		driver.get("http://omayo.blogspot.com/");
		WebElement dClick = driver.findElement(By.id("testdoubleclick"));
		Actions dc = new Actions(driver);
		dc.moveToElement(dClick).doubleClick().perform();

	}

}
