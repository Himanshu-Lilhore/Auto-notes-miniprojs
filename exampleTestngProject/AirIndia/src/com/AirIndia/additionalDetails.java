package com.AirIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class additionalDetails {
ChromeDriver updatedData;
	
	additionalDetails(ChromeDriver data)
	{
		this.updatedData = data;
	}
	
	public void clickOnadditionalDetails() throws InterruptedException {
		
		updatedData.get("https://www.airindia.in/");
		updatedData.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		updatedData.findElement(By.xpath("//a[contains(text(),\" Login\")]")).click();
			
			String parent =updatedData.getWindowHandle();
			java.util.Set<String> PC = updatedData.getWindowHandles();
			for(String i : PC)
			{
				updatedData.switchTo().window(i);
			}
			
			updatedData.findElement(By.name("Email Address")).sendKeys("Jananikkofficial@gmail.com");
			
			updatedData.findElement(By.id("password")).sendKeys("Janani@2000");
			
			updatedData.findElement(By.id("next")).click();
			
			updatedData.findElement(By.linkText("Your Profile")).click();
			
			updatedData.findElement(By.xpath("//span[contains(text(),\" Add another email address \")]")).click();
			
			updatedData.findElement(By.xpath("//span[contains(text(),\" Add another phone number \")]")).click();
			
			updatedData.findElement(By.xpath("(//input[@type=\"email\"])[2]")).sendKeys("Janu@gmail.com");
			
			updatedData.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("+9189");
			
			updatedData.findElement(By.xpath("(//input[@type=\"tel\"])[2]")).sendKeys("789027638929");
			
			updatedData.findElement(By.xpath("//span[text()=\"Save\"]")).click();
			
		}
}
