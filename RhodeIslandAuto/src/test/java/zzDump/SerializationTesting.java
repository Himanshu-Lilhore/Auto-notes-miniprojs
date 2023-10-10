package zzDump;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import commonScripts.M;
import commonScripts.MyDriver;

public class SerializationTesting
{
	public static MyDriver driver;
	public static String localDir = System.getProperty("user.dir");
	
	@Test
	public static void testIt() throws IOException, InterruptedException, ClassNotFoundException
	{
		M.env = "sitnt";  // ##
		driverInit();
		
		MyDriver sameDriver = null;

		File path = new File("C:\\Users\\hlilhore\\eclipse-workspace\\RhodeIslandAuto\\src\\test\\java\\data\\serializedDriver.txt");
		
		writeToFile(path);
		
		sameDriver = readFromFile(path);
		
//		sameDriver.switchTo().window(tab);
		sameDriver.get("https://www.fb.com");
		
		
		//M.save();  // ##
	}
	
	public void init(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
			ChromeDriver driverr = new ChromeDriver();
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\msedgedriver.exe");
			EdgeDriver driverrr = new EdgeDriver();
		}
	}
	
	
	
	
	public static void writeToFile(File path) throws FileNotFoundException, IOException
	{
		ObjectOutputStream write= new ObjectOutputStream (new FileOutputStream(path));
		write.writeObject(M.driver);
	}
	
	
	public static MyDriver readFromFile(File path) throws FileNotFoundException, IOException, ClassNotFoundException
	{
	    Object data = null;
	    ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(path));
	    data = inFile.readObject();
	    return (MyDriver)data;
	}
	
	public static void driverInit()
	{
		System.setProperty("webdriver.chrome.driver", localDir + "\\src\\test\\java\\data\\" + "chromedriver.exe");
		driver = new MyDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/notserializableexception-in-java-with-examples/");
	}
		
}


