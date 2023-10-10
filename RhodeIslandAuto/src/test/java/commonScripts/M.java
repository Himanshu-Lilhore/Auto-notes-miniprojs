package commonScripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import customerPortal.Doer;
import customerPortal.LoginCP;


public class M
{
//	public static ChromeDriver driver;
	public static MyDriver driver;
//	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static XSSFWorkbook book;
	public static String localDir = System.getProperty("user.dir");
	public static File serializationPath = new File(localDir + "\\src\\test\\java\\data\\" + "serializedDriver.txt");
	public static Properties p = new Properties();
//	public static Logger myLogger;
//	public static ExtentSparkReporter reporter;
//	public static ExtentReports extent;
//	public static boolean reportInitialized = false;
	public static String date;
	public static String time;
	public static Map<String, String> dataMap= new LinkedHashMap<String, String>();
	public static String env; // = "sitm";   // SITNT, SITM , SITN (stuck in SITMT)
	public static int totalRows;
	public static int totalCols;
	
	public static String username;
	public static String password;
	public static String caseNo;
	public static String url;
	public static String WPurl;
	public static Doer myDoer;
	public static ExtentTest data;
	public static String dateTimeFull;
	public static String portal;
	
	public static void allInit()
	{
		driverInit();
		setURL();
		privIssue();
		dateTimeInit();
		mapInit();
	}
	
	public static void driverInit()
	{
		System.setProperty("webdriver.chrome.driver", localDir + "\\src\\test\\java\\data\\" + "chromedriver.exe");
		driver = new MyDriver();
		driver.manage().window().maximize();
	}
	
	
	
	public static void endOfFlow() throws IOException
	{
		save();
		driver.quit();
		appendNewAccData();
	}
	
	
	public static void setURL()
	{
		switch(portal)
		{
		case "CP":
			url = "https://" + env + ".healthyrhode.ri.gov/HIXWebI3/DisplayHomePage.action";
			break;
		case "WP":
			url = "https://" + env + ".ribridges.ri.gov/toIES/SELoginAccess.jsp?fromIndex=true";
			break;
		}
		
		driver.get(url);
	}
	
	
	public static void privIssue()
	{
		if(driver.findElements(By.id("details-button")).size() != 0)
		{
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
		}
	}
	
	
	public static void dateTimeInit()
	{
		Date today = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyy");
	    date = formatter.format(today);
	    formatter = new SimpleDateFormat("HH:mm:ss");
	    time = formatter.format(today);
	    dateTimeFull = ((Long)(System.currentTimeMillis())).toString();
	}
	
	
	public static void mapInit()
	{
		dataMap.put("environment", env);
	    dataMap.put("date", date);
	    dataMap.put("time", time);
	    dataMap.put("used", "No");
	    dataMap.put("dateTimeFull", dateTimeFull);
	}
	
	
	public static void save() throws IOException
	{
		// Initializations
		BufferedWriter writer = null;
		File logFile = new File(localDir + "\\outputs\\" + date + ".log");
		writer = new BufferedWriter(new FileWriter(logFile, true));
        
        
        // Appending
        writer.write("[ " + time + " ]\n");
        for( Map.Entry<String, String> entry : dataMap.entrySet() )
        {
//        	if(!(entry.getKey().equals("username") 
//        			|| entry.getKey().equals("environment") 
//        			|| entry.getKey().equals("password")
//        			|| entry.getKey().equals("caseNo")))
//        		continue;
        	String spaces = String.format("%"+(18-entry.getKey().length())+"s", "");
            writer.write(entry.getKey() + spaces + ": " + entry.getValue() + "\n");
        }
        writer.write("---------------------------\n\n");

		writer.close();
	}
	
	
	public static void getSheet(int sheetNo) throws IOException
	{
//		Sheet details :
		// 0 - created accounts
		// 1 - WP users
		FileInputStream fis = new FileInputStream(localDir + "\\src\\test\\java\\data\\" + "RIdata.xlsx");
		book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(sheetNo);
		totalRows = sheet.getPhysicalNumberOfRows();
		totalCols = sheet.getRow(0).getLastCellNum();
	}

	
	public static String getActions(int row, int col) 
	{
		String val = sheet.getRow(row).getCell(col).getStringCellValue();
		return val;
	}
	
	
	public static void appendNewAccData() throws IOException
	{
		getSheet(0);
		String colName;
		XSSFCell newCell;
		XSSFRow newRow = sheet.createRow(totalRows);
		
		for(int count = 0; count<totalCols;)
		{
			colName = getActions(0, count);
			
			if(colName.equals("used"))
				LoginCP.targetCol = count;
			
			newCell = newRow.createCell(count++);
            newCell.setCellValue(dataMap.get(colName));
		}
		LoginCP.targetRow = totalRows;
		
		FileOutputStream fos = new FileOutputStream(localDir + "\\src\\test\\java\\data\\" + "accountsCreated.xlsx");
		book.write(fos);
        fos.close();
	}

	
	public static void updateData(int targetRow, int targetCol, String newVal) throws IOException
	{
		getSheet(0);
		XSSFCell thatCell;
		XSSFRow thatRow = sheet.getRow(targetRow);
		
		thatCell = thatRow.createCell(targetCol);
        thatCell.setCellValue(newVal);
            
		FileOutputStream fos = new FileOutputStream(localDir + "\\src\\test\\java\\data\\" + "accountsCreated.xlsx");
		book.write(fos);
        fos.close();
	}
	
	
	public static String randString(int len)
	{
		return RandomStringUtils.randomAlphabetic(len).toLowerCase();
	}
	
	public static void serializeDriver() throws FileNotFoundException, IOException
	{
		ObjectOutputStream write= new ObjectOutputStream (new FileOutputStream(serializationPath));
		write.writeObject(M.driver);
	}
	
	
	public static void deserializeDriver() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Object data = null;
	    ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(serializationPath));
	    data = inFile.readObject();
	    
	    driver = (MyDriver)data;
	    
	    int urlCol = getTargetCol("url");
		if(urlCol != -1)
		{
			url = getActions(totalRows-1, urlCol);
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
	
	
	public static int getTargetCol(String val) throws IOException
	{
		getSheet(0);
		String data;
		for(int i = 0; i<totalCols; i++)
		{
			data = getActions(0, i);
			if(data.equals(val))
			{
				return i;
			}
		}
		return -1;   // column not found
	}
	
	
	public static void loopTry(int timeLimit) throws InterruptedException
	{
		long startTime = System.currentTimeMillis();
		long timeElapsed = 0;
		
		while(timeElapsed < timeLimit)
		{
			Thread.sleep(1000);
			try
			{
				myDoer.doThis();
			    break;
			}
			catch (Exception e)
			{
				System.out.println("|~|" + e.getMessage().split("\n")[0] + "|~|");
			}
			timeElapsed = System.currentTimeMillis() - startTime;
		}
		
		if(timeElapsed >= timeLimit)
		{
			Assert.fail("|~| Time limit exceeded OR Element not found |~|");
		}
	}
	
	
	public static void takeScreenshot() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		Long currTime = System.currentTimeMillis();
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = localDir + "\\Screenshots\\" + M.dataMap.get("dateTimeFull") + "\\" + currTime + ".jpg";
		FileUtils.copyFile(SrcFile, new File(path));
	}
	
	
	public static void takeScreenshot(WebElement wb) throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		((JavascriptExecutor)M.driver).executeScript("arguments[0].scrollIntoView(true);", wb);
		int height = (int)Double.parseDouble( String.valueOf(((JavascriptExecutor)M.driver).executeScript("return window.scrollY;")) );
		((JavascriptExecutor)M.driver).executeScript("scroll(0, " + (height-150) + ");");
		M.takeScreenshot();
	}
	
	
//	public static void driverInit()
	{
//		// Chrome Driver
//		System.setProperty("webdriver.chrome.driver", localDir + "\\src\\test\\java\\data\\" + "chromedriver.exe");
//		
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.default_content_setting_values.notifications", 2);
//		prefs.put("credentials_enable_service", false);
//		prefs.put("profile.password_manager_enabled", false);
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", prefs);
//		options.addArguments("disable-infobars");
//		options.addArguments("--disable-notifications");
//		
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
	}
	
	public static void reader()
	{
//		File file = new File (localDir + "\\src\\test\\java\\LUMAcloud\\myLogFile.log");
//		String encoding = "UTF-8"; // Encoding of your file
//		Reader reader = new BufferedReader (new InputStreamReader (
//		    new FileInputStream (file), encoding));
		
//		List<String> lines = FileUtils.readLines(new File(localDir + "\\src\\test\\java\\LUMAcloud\\myLogFile.log"));
		
//		reader.close();
	}
	
	
	public static void test() //
	{
		myDoer.doThis();
	}

}

