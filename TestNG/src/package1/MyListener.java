package package1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Here ITestListener is an interface which we are implementing

public class MyListener implements ITestListener
{

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Script ending");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Script starting");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + " method got failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println(result.getName() + " method got skipped");
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName() + " method started executing");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " method excuted successfully");
	}

}
