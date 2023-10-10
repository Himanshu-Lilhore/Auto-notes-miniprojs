package package2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class FacebookDef {
	public ChromeDriver driver;
	
	@Given("^we open the browser$")
	public void open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		//to maximise browser window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Given("^we navigate to facebook website$")
	public void navigate() {
		driver.get("https://www.facebook.com");
	}
	
	//@Given("^we enter the mail \"(.*)\"$")
	@Given("^we enter the mail (.*)$")
	public void enterEmail(String myEmail) {
		driver.findElement(By.id("email")).sendKeys(myEmail);
	}
	
	//@Given("^we also enter the password \"(.*)\"$")
	@Given("^we also enter the password (.*)$")
	public void enterPassword(String myPass) {
		driver.findElement(By.id("pass")).sendKeys(myPass);
	}
	
	@Given("^close the browser$")
	public void close() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		
	}
	
	
	

}
