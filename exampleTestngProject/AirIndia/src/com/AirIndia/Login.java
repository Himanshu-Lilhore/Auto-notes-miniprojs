package com.AirIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{
	
	ChromeDriver updatedData;
	
	Login(ChromeDriver data)
	{
		this.updatedData = data;
	}
		
	public void clickOnLogin() 
	{
	updatedData.findElement(By.xpath("//a[contains(text(),\" Login\")]")).click();//Login icon
	java.util.Set<String> PC = updatedData.getWindowHandles();
	
	for(String p : PC)
	{
		updatedData.switchTo().window(p);
	}
	
	updatedData.findElement(By.name("Email Address")).sendKeys("jananikkofficial@gmail.com");//Entering Email
	updatedData.findElement(By.id("password")).sendKeys("Janani@2000");//Entering password
	updatedData.findElement(By.id("next")).click(); //Click submit
	
	}
	

}
