package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test(priority = 1, groups = {"loan"})
	public void test1()
	{
		System.out.println("Loan - Test Priority 1");
	}
	
	@Test(priority = 2, groups = {"insurance"})
	public void test2()
	{
		System.out.println("Test Priority 2");
	}
	
	@AfterMethod
	public void afMethod()
	{	
		System.out.println("After Method");
	}

}
