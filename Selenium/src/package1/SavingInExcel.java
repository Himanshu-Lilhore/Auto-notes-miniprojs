package package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SavingInExcel
{
	public static XSSFSheet sheet;
	public static ChromeDriver driver;
	
	
	public static String getActions(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
}
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		FileInputStream fis =new FileInputStream("C:\\Users\\hlilhore\\eclipse-workspace\\Selenium\\src\\package2\\info.xlsx");
		
		//1. Access the excel file
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		//2 Access the proper sheet in that excel file
		sheet=book.getSheetAt(0);
		
		//3. Access the proper rows
		int rowsCount =sheet.getPhysicalNumberOfRows();
		
		for(int i=1;i<rowsCount;i++) {
			// when i=1-->navigate
			//when i=2-->open....when i=5-->close
			
			String myActions=SavingInExcel.getActions(i,2);
			System.out.println(myActions);
			
			switch(myActions) {
			
			case "open":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hlilhore\\Desktop\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				break;
				
			case "navigate":
				driver.get("https://www.facebook.com");
				break;
				
			case "type1" :
				driver.findElement(By.id(SavingInExcel.getActions(i, 3))).sendKeys(SavingInExcel.getActions(i, 4));
				break;
				
			case "type2" :
				driver.findElement(By.id(SavingInExcel.getActions(i,3))).sendKeys(SavingInExcel.getActions(i, 4));
				break;
				
			case "close":
				Thread.sleep(3000);
				driver.close();
				break;
			
			}
			
		}
		
	}

}
