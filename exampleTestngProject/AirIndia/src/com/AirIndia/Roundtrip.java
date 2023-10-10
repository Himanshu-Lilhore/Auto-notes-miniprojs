package com.AirIndia;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roundtrip {

	ChromeDriver updatedData;
	
	Roundtrip(ChromeDriver data)
	{
		this.updatedData = data;
	}
	
	@Test
	public void clickOnRoundtrip() throws InterruptedException, IOException 
	{
		
	updatedData.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div[2]/div/ins")).click();//Roundtrip
	updatedData.findElement(By.id("from")).sendKeys("New York, New York John F Kennedy International Airport, JFK, United States");//From
	updatedData.findElement(By.id("to")).sendKeys("Bangkok, Suvarnabhumi International Airport, BKK, Thailand");//To
	updatedData.findElement(By.id("_depdateeu1")).click();//depart textbox
	updatedData.findElement(By.linkText("22")).click();//date
	updatedData.findElement(By.id("_retdateeu1")).click();//Return textbox
	updatedData.findElement(By.linkText("29")).click();//date
	updatedData.findElement(By.xpath("//*[@id=\"ddlchildren1\"]/option[3]")).click();//children
	updatedData.findElement(By.xpath("//*[@id='ddlinfants1']/option[2]")).click();//infants
	updatedData.findElement(By.id("btnbooking")).click();//search
	
//	Thread.sleep(3000);	
	updatedData.findElement(By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/refx-carousel/div/ul/li[8]/div/button/span[1]/div[1]/div/refx-price-cont/refx-price/span/span")).click();//search

	
	Date MyDate=new Date();
	String updatedinfo=MyDate.toString().replace(" ","-").replace(":","-");
	File ScreenShortFile = ((TakesScreenshot)updatedData).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShortFile, new File("./SCREENSHOTS/RoundTrip"+updatedinfo+".jpg"));
	

	
	}
	
	
	
	
	
}
