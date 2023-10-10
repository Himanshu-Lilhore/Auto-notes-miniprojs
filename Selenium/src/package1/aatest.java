package package1;



import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class aatest {
	
	public static ChromeDriver driver;
	public static String localDir = System.getProperty("user.dir");
	
	public static void takeScreenshot(String myClassName) throws IOException
	{
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String className = myClassName.split(" ")[1].split("\\.")[1];
		FileUtils.copyFile(SrcFile, new File(localDir + "\\screenshots\\" + myClassName + ".jpg"));
	}

              public static void main(String args[]) throws InterruptedException, IOException

              {
            	  
	
	              System.setProperty("webdriver.chrome.driver","C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
	
	             driver=new ChromeDriver();
	
	             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	             driver.manage().window().maximize();
	
	             driver.get("https://www.tata.com/");
//	
	                       takeScreenshot("him");     
	                       
	                       driver.quit();
//	
//	                             Thread.sleep(1000);
//	
//	                            
//	
//	//           driver.findElements(By.xpath("//section/div/div/div/button")).get(0).click();
//	                             
//	             JavascriptExecutor js = (JavascriptExecutor)driver;
//	             js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
//	             Thread.sleep(1000);
//	
//	             WebElement wb = driver.findElements(By.xpath("//div[@type='submit')]")).get(1);
//	             Thread.sleep(1000);
//	             wb.click();
////	             wb.sendKeys("abcd@gmail.com");

              }

}