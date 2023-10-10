package com.AirIndia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OnewayPay {

		ChromeDriver updatedData;
			
			OnewayPay(ChromeDriver data)
			{
				this.updatedData = data;
			}
		
			
			@Parameters({"from","to"})
			@Test
			public void clickOnewayPay(String from,String to)throws InterruptedException 
			{
			updatedData.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div[1]/div/ins")).click();//OneWay
			updatedData.findElement(By.id("from")).sendKeys(from);//From textbox
			updatedData.findElement(By.id("to")).sendKeys(to);//To textbox
			updatedData.findElement(By.id("_depdateeu1")).click();//depart textbox
			updatedData.findElement(By.linkText("21")).click();//date
			updatedData.findElement(By.xpath("//*[@id=\"ddlchildren1\"]/option[3]")).click();//children
			updatedData.findElement(By.xpath("//*[@id='ddlinfants1']/option[2]")).click();//infants
			updatedData.findElement(By.id("btnbooking")).click();//search
			
			Thread.sleep(9000);
			
			updatedData.findElement(By.xpath("(//div[text()=\"Economy\"])[1]")).click();
	        updatedData.findElement(By.className("top-section-container")).click();
	        updatedData.findElement(By.xpath("//span[text()=\"Continue\"]")).click();
	        updatedData.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/refx-fare-comparison-dialog-pres/refx-dialog-pres/div/div[2]/div/div[3]/button[2]/span[1]/span")).click();
	        updatedData.findElement(By.xpath("//span[text()=\"Fill passenger details\"]")).click();
	        //Passenger1
	        updatedData.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("JANANI");
	        updatedData.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("K K");
	        updatedData.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("jananikkofficial@gmail.com");
	        updatedData.findElement(By.xpath("(//input[@type=\"email\"])[2]")).sendKeys("jananikkofficial@gmail.com");
	        updatedData.findElement(By.xpath("//input[@autocomplete=\"no\"]")).sendKeys("(+91)");
	        updatedData.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("2546789");

	        JavascriptExecutor js = (JavascriptExecutor)updatedData;
			WebElement chkbox = updatedData.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
			js.executeScript("arguments[0].click();", chkbox);
			
			updatedData.findElement(By.xpath("//span[text()=\"Confirm\"]")).click();
			
			WebElement checkout = updatedData.findElement(By.xpath("//span[contains(text(),\"Checkout\")]"));
			js.executeScript("arguments[0].click();", checkout);
	       		}
	
}