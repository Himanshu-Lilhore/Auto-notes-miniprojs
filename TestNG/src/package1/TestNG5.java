package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
	
	@Test
	public void login()
	{
		System.out.println("here");
		Assert.fail();   // making it fail manually
		System.out.println("Login successful");
	}
	
	@Test(dependsOnMethods="login", alwaysRun=true)
	public void inbox()
	{
		System.out.println("Inbox functionality");
	}
	
	@Test(dependsOnMethods="login", alwaysRun=true)
	public void sentItems()
	{
		System.out.println("Sent items");
	}
	
	@Test(enabled=false)
	public void compose()
	{
		System.out.println("Compose functionality");
	}
	
	@Test(invocationCount = 5)
	public void logout()
	{
		System.out.println("Logout successful");
	}
	
	@Test(invocationCount = 3)
	public void abc()
	{
		System.out.println("abc method");
	}
	
}
