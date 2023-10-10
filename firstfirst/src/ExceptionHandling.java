
class Rectangle
{
	public int calculateArea(int length, int breadth) throws Exception
	{
		if(length < 0 || breadth < 0)
		{
			throw new Exception("Length and breadth cannot be negative");
		}
		else
		{
			int area = length * breadth;
			return area;
		}
	}
	
	public void method2() throws Exception
	{
		int result = calculateArea(20, 10);
		System.out.println(result);
	}
	
	public void method1() throws Exception
	{
		method2();
	}
}


public class ExceptionHandling {

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		try
		{
			r.method1();
		}
		catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
