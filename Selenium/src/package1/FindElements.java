package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.reddit.com/");
		
		List<WebElement> data = driver.findElements(By.tagName("a"));
		
		int count = data.size();
		System.out.println("Total count : " + count);
		
		for(WebElement i : data)
		{
			System.out.println(i.getText());
		}
		
		driver.quit();
	}

}
