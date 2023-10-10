package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		dropDown.click();
		Select s = new Select(dropDown);
//		s.selectByIndex(11);
//		s.selectByVisibleText("Gift Cards");
//		s.selectByValue("search-alias=nowstore");

	}

}
