package com.AirIndia;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Manage {
	
	ChromeDriver updatedData;
	
	Manage(ChromeDriver data)
	{
		this.updatedData = data;
	}
	
	public void clickOnManage() throws IOException 
	{  
	
	updatedData.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UserMenuHorizontal1_divMenu\"]/ul/li[1]/a")).click();//Manage
    updatedData.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UserMenuHorizontal1_divMenu\"]/ul/li[1]/div/ul/li[2]/a")).click();//flight timetable
    updatedData.findElement(By.xpath("//*[@id='ContentPlaceHolder1_FlightTimeTable_rdbJourneyType']/tbody/tr/td[1]/div/ins")).click();//oneway
    updatedData.findElement(By.id("txtFromDate")).click();//Calendar
    updatedData.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")).click();//date
    updatedData.findElement(By.xpath("//*[@id=\"txtFromLocation\"]")).sendKeys("Delhi, Indira Gandhi International Airport, DEL, India");//From
    updatedData.findElement(By.xpath("//*[@id=\"txtToLocation\"]")).sendKeys("Hyderabad, Rajiv Gandhi International Airport, HYD, India");//To
    
//    updatedData.findElement(By.id("btnFlightTimeTable")).click();//submit

    Date MyDate5=new Date();
	String updatedinfo5=MyDate5.toString().replace(" ","-").replace(":","-");
	File ScreenShortFile5 = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShortFile5, new File("./SCREENSHOTS/Manages"+updatedinfo5+".jpg"));
    updatedData.switchTo().window(new LinkedList<String>(updatedData.getWindowHandles()).get(0));
    
	}
}
