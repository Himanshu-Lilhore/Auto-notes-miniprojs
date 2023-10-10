package package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		// Full page screenshot :
		File myScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myScreenshot, new File("screenshots/first.jpg"));
		
		// Single element screenshot :
		WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
		File myScreenshot2 = ((TakesScreenshot)box).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myScreenshot2, new File("screenshots/second.jpg"));
		
		// Screenshot with border around element :
		WebElement can = driver.findElement(By.xpath("//a[text() = 'Canada']"));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].style.border = '10px solid yellow'", can);
		File myScreenshot3 = ((TakesScreenshot)can).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myScreenshot3, new File("screenshots/third.jpg"));
		
	}

}
