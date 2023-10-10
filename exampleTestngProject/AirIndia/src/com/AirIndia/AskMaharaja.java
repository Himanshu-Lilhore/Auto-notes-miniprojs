package com.AirIndia;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AskMaharaja {
	
	ChromeDriver updatedData;
	
	AskMaharaja(ChromeDriver data)
	{
		this.updatedData = data;
	}
	
	@Test
	public void clickOnAskMaharaja() throws IOException 
	{  
		updatedData.findElement(By.xpath("//span[text()=\"Ask Maharajah\"]")).click(); 
		updatedData.findElement(By.xpath("//button[text()=\"Covid Info\"]")).click();
		updatedData.findElement(By.xpath("//button[text()=\"End Chat\"]")).click();
		
		//END TEXT VALIDATION
		WebElement element=updatedData.findElement(By.xpath("//span[text()=\"Thanks for Contacting us. Goodbye! Have a great Day.\"]"));
		if(element.isDisplayed())
		{
			System.out.println("EXPECTED MESSAGE IS DISPLAYED");
		}
		else 
		{
			System.out.println("EXPECTED MESSAGE IS NOT DISPLAYED");	
	
		}
		Date MyDate=new Date();
		String updatedinfo=MyDate.toString().replace(" ","-").replace(":","-");
		File ScreenShortFile = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShortFile, new File("./SCREENSHOTS/Askmaharaja"+updatedinfo+".jpg"));
		
		//VALIDATING THE TITLE
		String actualTitle = updatedData.getTitle();
		String expectedTitle = "Air India";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("EXPECTED TITLE MATCHED");
		}
		else
		{
		System.out.println("EXPECTED TITLE NOT MATCHED");
		
		
		
//		File screenshotfile= ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
//        try {
//			FileUtils.copyFile(screenshotfile, new File("./SCREENSHOTS/Askmaharaja"+updatedinfo+".jpg"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		}
		
		
	}
	
}
