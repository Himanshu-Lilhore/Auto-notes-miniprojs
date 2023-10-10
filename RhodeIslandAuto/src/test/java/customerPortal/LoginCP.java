package customerPortal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonScripts.*;
import customerPortal.cpPages.*;

public class LoginCP 
{
	public static String username = null;
	public static String password = null;
	public static int targetCol = -1, targetRow = -1;
	public static boolean codeReuse = false;
	
	
	@Test
	public static void login() throws IOException, InterruptedException
	{
//		if(!codeReuse)
//		{
//			M.allInit();
//			getNewCreds();
//		}
//		else
//		{
//			username = M.dataMap.get("username");
//			password = M.dataMap.get("password");
//		}
		
		
		Homepage.gotoLoginPage();
		
		LoginOrCreateAcc.fillDetails();
		LoginOrCreateAcc.clickLogin();
		
		
//		if(codeReuse)
//			codeReuse = false;
//		else
//		{
//			markUsed();
//		}
	}
	
	
	public static void getNewCreds() throws IOException
	{
		M.getSheet(0);
		String val, env;
		int usernameCol = -1, passCol = -1, envCol = -1;
		for(int i = 0; i<M.totalCols; i++)
		{
			val = M.getActions(0, i);
			if(val.equals("used"))
			{
				targetCol = i;
			}
			if(val.equals("username"))
			{
				usernameCol = i;
			}
			if(val.equals("password"))
			{
				passCol = i;
			}
			if(val.equals("environment"))
			{
				envCol = i;
			}
		}
		
		if(targetCol != -1)
		{
			for(int i = 0; i<M.totalRows; i++)
			{
				val = M.getActions(i, targetCol);
				env = M.getActions(i, envCol);
				if(env.equals(M.env) && val.equals("No"))
				{
					username = M.getActions(i, usernameCol);
					password = M.getActions(i, passCol);
					targetRow = i;
					break;
				}
			}
		}
	}
	
	
	public static void markUsed() throws IOException
	{
		M.updateData(targetRow, targetCol, "Yes");
	}
}
