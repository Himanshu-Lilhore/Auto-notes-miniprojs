package workerPortal.wpPages;

import java.io.IOException;

import org.openqa.selenium.By;

import commonScripts.M;

public class LoginPage
{
	public static String WPusername;
	public static String WPpassword;
	
	public static void enterCreds(String userType) throws IOException
	{
		// et - ET user
		// cc - CC user
		// su - SUpervisor
		// ad - gsecADmin
		
		M.dataMap.put("WPuserType", userType);
		getWPuserCreds(userType);
		M.driver.findElement(By.id("username")).sendKeys(WPusername);
		M.driver.findElement(By.id("password")).sendKeys(WPpassword);
	}
	
	public static void clickLogin()
	{
		M.driver.findElement(By.xpath("//div/button[contains(text(),'Login')]")).click();
	}
	
	public static void getWPuserCreds(String userType) throws IOException
	{
		M.getSheet(1);
		int envCol = -1, userTypeCol = -1, usernameCol = -1, passCol = -1;
		
		for(int j=0; j<M.totalCols; j++)
		{
			switch(M.getActions(0, j))
			{
			case "env":
				envCol = j;
				break;
			case "userType":
				userTypeCol = j;
				break;
			case "username":
				usernameCol = j;
				break;
			case "password":
				passCol = j;
				break;
			}
		}
		
		
		for(int i=1; i<M.totalRows; i++)
		{
			if(M.getActions(i, envCol).equals(M.env))
			{
				if(M.getActions(i, userTypeCol).equals(userType))
				{
					WPusername = M.getActions(i, usernameCol);
					WPpassword = M.getActions(i, passCol);
				}
			}
		}
	}
}
