package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Report {
	
  @Test
  public void script()
  {
    
   org.apache.logging.log4j.Logger myLogger = LogManager
     .getLogger(Report.class.getName());
   
   //connect that log4j2 file
   
   DOMConfigurator.configure("log4j2.xml");
   
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe"); 
   
   myLogger.info("Opening the browser");
   ChromeDriver driver = new ChromeDriver(); 
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
   driver.manage().window().maximize();
   

   myLogger.info("Opening the Website");
   driver.get("https://www.google.co.in");
   

   myLogger.info("Fetching the title");
   String myTitle = driver.getTitle();
   if(myTitle.equals("Google"))
   {
    myLogger.info("Title is Valid");
   }
  }
}
