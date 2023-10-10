
class Human
{
	String name = "Himanshu";
	
	public void human()
	{
		System.out.println("Has a name");
	}
	
	class Brain
	{
		int parts = 3;
		
		public void brain()
		{
			System.out.println(name);
			System.out.println("has a brain");
		}
	}
	
	class Heart
	{
		int weight = 10;
		public void heart()
		{
			System.out.println(name);
			System.out.println("Has a heart");
		}
	}
}

// homosapians

public class InnerClass2 {

	public static void main(String[] args)
	{
		Human hu1 = new Human();
		Human.Brain br1 = hu1.new Brain();
		Human.Heart he1 = hu1.new Heart();
		
		hu1.human();
		br1.brain();
		he1.heart();
		
		System.out.println(he1.weight);

	}

}
