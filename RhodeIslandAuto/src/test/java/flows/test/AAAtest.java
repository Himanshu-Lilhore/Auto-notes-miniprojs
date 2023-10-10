package flows.test;

import java.lang.invoke.MethodHandles;

import org.testng.annotations.Test;

import commonScripts.M;

public class AAAtest
{
	
	
	
	public static void printer()
	{
		String thisClassName = MethodHandles.lookup().lookupClass().toString();
		System.out.println(thisClassName);
	}
	
	@Test
	public static void meriMtd()
	{
		M.myDoer = AAAtest::printer;
		try 
		{
			M.test();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
//	
//	public static MyDriver driver;
//	public static String localDir = System.getProperty("user.dir");
//	
//	@Test
//	public static void testIt() throws IOException, InterruptedException, ClassNotFoundException
//	{
//		M.env = "sitnt";  // ##
//		driverInit();
//		
//		driver.get("https://www.geeksforgeeks.org/notserializableexception-in-java-with-examples/");
//		Thread.sleep(4000);
//		MyDriver sameDriver = null;
//
//		File path = new File("C:\\Users\\hlilhore\\eclipse-workspace\\RhodeIslandAuto\\src\\test\\java\\data\\serializedDriver.txt");
//		
//		writeToFile(path);
//		
//		sameDriver = readFromFile(path);
//		M.driver = sameDriver;
//		driverInit();
////		sameDriver.switchTo().window(tab);
//		driver.get("https://www.fb.com");
//		
//		
//		//M.save();  // ##
//	}
//	
//	public void init(String browserName)
//	{
//		if(browserName.equals("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
//			ChromeDriver driverr = new ChromeDriver();
//		}
//		else if(browserName.equals("edge"))
//		{
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\msedgedriver.exe");
//			EdgeDriver driverrr = new EdgeDriver();
//		}
//	}
//	
//	
//	
//	
//	public static void writeToFile(File path) throws FileNotFoundException, IOException
//	{
//		ObjectOutputStream write= new ObjectOutputStream (new FileOutputStream(path));
//		write.writeObject(M.driver);
//	}
//	
//	
//	public static MyDriver readFromFile(File path) throws FileNotFoundException, IOException, ClassNotFoundException
//	{
//	    Object data = null;
//	    ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(path));
//	    data = inFile.readObject();
//	    return (MyDriver)data;
//	}
//	
//	public static void driverInit()
//	{
//		System.setProperty("webdriver.chrome.driver", localDir + "\\src\\test\\java\\data\\" + "chromedriver.exe");
//		driver = new MyDriver();
//		driver.manage().window().maximize();
//		
//	}
		
}


