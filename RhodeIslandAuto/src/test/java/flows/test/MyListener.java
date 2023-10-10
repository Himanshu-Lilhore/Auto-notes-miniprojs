package flows.test;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import commonScripts.M;

// Here ITestListener is an interface which we are implementing

public class MyListener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		try 
		{
//			M.serializeDriver();
//			System.out.println("Serialized the Driver");
			
			M.url = M.driver.getCurrentUrl();
			M.dataMap.put("url", M.url);
			M.save();
			M.appendNewAccData();
			System.out.println("Saved url & other data");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}


	@Override
	public void onTestSkipped(ITestResult result) 
	{
//		System.out.println(result.getName() + " method got skipped");
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
//		System.out.println(result.getName() + " method started executing");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
//		System.out.println(result.getName() + " method excuted successfully");
	}

}
