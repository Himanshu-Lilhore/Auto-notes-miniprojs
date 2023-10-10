package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJsEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement data = driver.findElement(By.xpath("//a[text() = 'Canada']"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		// scrolling to a particular element till come in view
		ex.executeScript("arguments[0].scrollIntoView()", data);
		ex.executeScript("arguments[0].style.border = '10px solid yellow'", data);
	}

}
