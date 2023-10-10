package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Advanced']")).click();
		driver.findElement(By.id("_nkw")).sendKeys("Phone");
		
		WebElement dd = driver.findElement(By.id("_in_kw"));
		dd.click();
		Select s = new Select(dd);
		s.selectByVisibleText("Any words, any order");
		
		driver.findElement(By.name("_udlo")).sendKeys("10000");
		driver.findElement(By.name("_udhi")).sendKeys("50000");
		
		driver.findElement(By.id("LH_ItemConditionNew")).click();
		
		WebElement dd2 = driver.findElement(By.id("_sargnSelect"));
		dd2.click();
		Select s2 = new Select(dd2);
		s2.selectByVisibleText("Worldwide");

		driver.findElement(By.id("searchBtnLowerLnk")).click();
		
		String count = driver.findElement(By.xpath("(//span[@class='BOLD'])[0]")).getText();
		
		System.out.println("Total count : " + count);
		
		WebElement butt = driver.findElement(By.name("fake-menu-button__button"));
		butt.click();
		Select s3 = new Select(butt);
		s3.selectByVisibleText("Price + Shipping: highest first");
		
		String one = driver.findElement(By.xpath("(//span[@role='heading'])[0]")).getText();
		String two = driver.findElement(By.xpath("(//span[@role='heading'])[1]")).getText();
		String three = driver.findElement(By.xpath("(//span[@role='heading'])[2]")).getText();
		
		String onep = driver.findElement(By.xpath("(//span[@role='s-item__price'])[0]")).getText();
		String twop = driver.findElement(By.xpath("(//span[@role='s-item__price'])[1]")).getText();
		String threep = driver.findElement(By.xpath("(//span[@role='s-item__price'])[2]")).getText();
		
		System.out.println(one + " : " + onep);
		System.out.println(two + " : " + twop);
		System.out.println(three + " : " + threep);
		
	}

}
