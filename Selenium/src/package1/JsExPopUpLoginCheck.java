package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExPopUpLoginCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		driver.findElement(By.name("email")).sendKeys("9584990466");
		driver.findElement(By.id("pass")).sendKeys("my@password");
		WebElement butt = driver.findElement(By.name("login"));
		butt.click();
		
		if(butt.isDisplayed())
		{
			ex.executeScript("alert('Login unsuccessful')");
		}
		else
		{
			ex.executeScript("alert('Login Successful')");
		}
		
		driver.quit();

	}

}
