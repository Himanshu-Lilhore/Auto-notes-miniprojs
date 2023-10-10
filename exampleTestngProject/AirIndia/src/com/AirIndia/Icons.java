package com.AirIndia;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icons {

		ChromeDriver updatedData;
		
		Icons(ChromeDriver data)
		{
			this.updatedData = data;
		}
		
		
		public void clickOnIcons() throws InterruptedException, IOException 
		{  		
			JavascriptExecutor js = (JavascriptExecutor)updatedData ;  
			js.executeScript("window.scrollBy(0,3050)");
			
			//INSTAGRAM
		    WebElement i= updatedData.findElement(By.xpath("//img[@src=\"assets/images/instagram1.svg\"]"));
		    i.click();
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(1));
		    System.out.println("Title id"+updatedData.getTitle());
		    Thread.sleep(3000);
		    Date MyDate=new Date();
			String updatedinfo=MyDate.toString().replace(" ","-").replace(":","-");
			File ScreenShortFile = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenShortFile, new File("./SCREENSHOTS/Instgram"+updatedinfo+".jpg"));
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(0));
		    
		    //TIWTTER
			WebElement t= updatedData.findElement(By.xpath("//img[@src=\"assets/images/tw.svg\"]"));
			t.click();
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(2));
		    System.out.println("Title id"+updatedData.getTitle());
		    Thread.sleep(3000);
		    Date MyDate1=new Date();
			String updatedinfo1=MyDate1.toString().replace(" ","-").replace(":","-");
			File ScreenShortFile1 = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenShortFile1, new File("./SCREENSHOTS/Twitter"+updatedinfo1+".jpg"));
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(0));
			
		    //FACEBOOK
		    WebElement f= updatedData.findElement(By.xpath("//img[@src=\"assets/images/fb.svg\"]"));
		    f.click();
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(3));
		    System.out.println("Title id"+updatedData.getTitle());
		    Thread.sleep(3000);
		    Date MyDate2=new Date();
			String updatedinfo2=MyDate2.toString().replace(" ","-").replace(":","-");
			File ScreenShortFile2 = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenShortFile2, new File("./SCREENSHOTS/Facebook"+updatedinfo2+".jpg"));
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(0));
		    
		    //YOUTUBE
		    WebElement y= updatedData.findElement(By.xpath("//img[@src=\"assets/images/yt.svg\"]"));
		    y.click();
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(4));
		    System.out.println("Title id"+updatedData.getTitle());
		    Thread.sleep(3000);
		    Date MyDate3=new Date();
			String updatedinfo3=MyDate3.toString().replace(" ","-").replace(":","-");
			File ScreenShortFile3 = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenShortFile3, new File("./SCREENSHOTS/Youtube"+updatedinfo3+".jpg"));
		    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(0));
		    
			
		}
}
