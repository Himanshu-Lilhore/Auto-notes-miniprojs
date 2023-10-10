package flows.test;

import java.io.IOException;

import org.testng.annotations.Test;

import commonScripts.M;
import customerPortal.*;

@Test
public class CP_createAcc_login
{
	public static void doit() throws InterruptedException, IOException
	{
		M.env = "sitnt";
		
		M.allInit();
		
		new CreateAccCP();
		
		LoginCP.login();
		
		M.save();
		
	}
}
