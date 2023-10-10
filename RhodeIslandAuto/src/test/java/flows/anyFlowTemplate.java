package flows;

import java.io.IOException;
import java.lang.invoke.MethodHandles;

import commonScripts.M;

public class anyFlowTemplate 
{
	public static void completeFlow() throws InterruptedException, IOException
	{
		setEnv();
		cpPart();
		wpPart();
	}
	
	public static void cpPart()
	{
		
	}
	
	public static void wpPart()
	{
		
	}
	
	public static void setEnv()
	{
		String thisClassName = MethodHandles.lookup().lookupClass().toString();
		System.out.println(thisClassName);
		M.env = thisClassName.split(" ")[1].split("\\.")[1].toLowerCase();
		System.out.println(M.env);
	}
}
