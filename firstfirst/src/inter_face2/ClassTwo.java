package inter_face2;

import inter_face.ClassOne;

public class ClassTwo extends ClassOne
{
	public static void main(String args[])
	{
		System.out.println("Start");
	}
	public void display1()
	{
//		System.out.println(a);  // private
		System.out.println(b);
		System.out.println(c);
//		System.out.println(d);  // default
	}
}

class E
{
	public void display1()
	{
		ClassOne obj = new ClassOne();
//		System.out.println(obj.a);
		System.out.println(obj.b);   // public
//		System.out.println(obj.c);   // protected
//		System.out.println(obj.d);   // default
	}
}
