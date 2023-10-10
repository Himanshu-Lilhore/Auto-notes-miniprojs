package package2;

import org.testng.annotations.Test;

public class First
{
	public int num1, num2;
	
	public First(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Test
	public void f1()
	{
		System.out.println(num1 + num2);
	}
	
	@Test
	public void f2()
	{
		System.out.println(num1 + num2);
	}
}
