package extentReport;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//Extent Report --> Track evering related to a selenium test

//ExtentSparkReporter(Bogie) --> create a report(html) --> extentreports jar file

//ExtentXmlReporter

//ExtentReports --> class(Engine)

//Train

//Engine -> bogie1 bogie2

public class Report
{
 public ChromeDriver driver;
 public ExtentReports extent;
 @BeforeTest
 public void createReport()

{
  ExtentSparkReporter reporter = new ExtentSparkReporter("reports/result.html"); 
  reporter.config().setDocumentTitle("First Google Report");
  reporter.config().setTheme(Theme.DARK);
  
  extent = new ExtentReports();
  extent.attachReporter(reporter);
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe"); 
  driver = new ChromeDriver(); 
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
  driver.manage().window().maximize();
 }
 @Test
 public void google()
 {
  ExtentTest data = extent
  .createTest("Verifying the Title of Google")
  .assignAuthor("John")
  .assignDevice("MAC");
  
  
  
  data.info("Navigating to the Website");
  
  driver.get("https://www.google.co.in");
  
  data.info("Fetching the Page Title");
  
  String myTitle = driver.getTitle();
  
  if(myTitle.equals("Google"))
  {
   data.pass("Title is Valid");
  }
  else
  {
   data.fail("Title is invalid");
  }
 }
 @Test
 public void second()
 {
  ExtentTest data = extent
    .createTest("Verifying the Title Again")
    .assignAuthor("Raju")
    .assignDevice("MAC");
  
  
  data.info("Navigating to the Website");
  
  driver.get("https://www.google.co.in");
  
  data.info("Fetching the Page Title");
  
  String myTitle = driver.getTitle();
  
  if(myTitle.equals("Goole"))
  {
   data.pass("Title is Valid");
  }
  else
  {
   data.fail("Title is invalid");
  }
  
  
  
 }
 @AfterTest
 public void sendData()
 {
  extent.flush();
  driver.close();
 }
}
