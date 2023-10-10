package com.AirIndia;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public  class AIRINDIAA {

	@Parameters
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jankk\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.airindia.in/");
		
//		Login l=new Login(driver);
//		l.clickOnLogin();
		
		OnewayPay one=new OnewayPay(driver);
		one.clickOnewayPay();
//		
//		Roundtrip r=new Roundtrip(driver);
//		r.clickOnRoundtrip();
//		
//		AskMaharaja a=new AskMaharaja(driver);
//		a.clickOnAskMaharaja();
//		
//		
//		Icons i=new Icons(driver);
//		i.clickOnIcons();
		
//		additionalDetails ad=new additionalDetails(driver);
//		ad.clickOnadditionalDetails();
		
//		Hyperlinks h=new Hyperlinks(driver);
//		h.clickOnHyperlinks();
		
//		Manage m=new Manage(driver);
//		m.clickOnManage();

	}
	
}
