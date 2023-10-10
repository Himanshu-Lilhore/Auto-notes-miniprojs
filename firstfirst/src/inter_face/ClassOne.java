package inter_face;

public class ClassOne 
{
	private int a = 10;
	public int b = 20;
	protected int c = 30;
	int d = 40;    // default
}

class B extends ClassOne
{
	public void display1()
	{
//		System.out.println(a);   // private
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class C
{
	public void display1()
	{
		ClassOne obj = new ClassOne();
//		System.out.println(obj.a);   // private
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}