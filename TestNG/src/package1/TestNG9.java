package package1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyListener.class)
public class TestNG9 {
	
	@Test
	public void first()
	{
		System.out.println("1st method");
	}
	
	@Test
	public void second()
	{
		Assert.fail();
		System.out.println("2nd method");
	}
	
	@Test
	public void third()
	{
		System.out.println("3rd method");
	}
}
