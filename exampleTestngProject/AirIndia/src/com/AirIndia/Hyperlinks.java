package com.AirIndia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	ChromeDriver updatedData;
	
	Hyperlinks(ChromeDriver data)
	{
		this.updatedData = data;
	}
	
	
	public void clickOnHyperlinks() 
	 { 
		WebElement link=updatedData.findElement(By.className("foot_bg"));
		List<WebElement>open=link.findElements(By.tagName("a"));
		for(WebElement l:open)
		 {
			System.out.println(l.getText());
		 }
	 }
	
	
	
}
