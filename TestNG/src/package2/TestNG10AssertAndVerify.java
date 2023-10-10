package package2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG10AssertAndVerify 
{
	public void display()
	{
		Assert.fail();    // assert fail
		System.out.println("helo");
	}
	
	@Test
	public void display1()
	{
		SoftAssert sa = new SoftAssert();
		sa.fail();    // verify fail
		System.out.println("hi");
	}
}
