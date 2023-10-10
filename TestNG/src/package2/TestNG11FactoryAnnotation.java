package package2;

import org.testng.annotations.Factory;

public class TestNG11FactoryAnnotation 
{
	@Factory
	public Object[] myFactory()
	{
		Object[] data = new Object[6];
		
		data[0] = new First(10, 20);
		data[1] = new First(20, 30);
		data[2] = new First(30, 40);
		data[3] = new First(40, 50);
		data[4] = new First(50, 60);
		data[5] = new First(60, 70);
		
		return data;
	}
}
