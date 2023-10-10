package flows.test;

import java.io.IOException;

import org.testng.annotations.Test;

import commonScripts.M;
import workerPortal.wpPages.LoginPage;
import workerPortal.wpPages.NavBar;

public class Combinedflow 
{
	@Test
	public static void completeFlow() throws IOException
	{
		M.env = "sitnt";
		
		ARflow();
//		DCflow();
	}
	
	public static void ARflow() throws IOException
	{
		M.portal = "WP";
		M.allInit();
		
		LoginPage.enterCreds("su");
		LoginPage.clickLogin();
		
		NavBar.applicationRegistration("register");
		
	}
	
	public static void DCflow()
	{
		M.portal = "WP";
	}
}
