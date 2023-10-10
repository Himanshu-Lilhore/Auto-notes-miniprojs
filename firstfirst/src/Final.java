
final class Demon
{
	final double pi = 3.14;
	final public void display()
	{
		System.out.println("Demon class display method");
	}
	public void display(int i)
	{
		System.out.println(i);
	}
}

//class Launch extends Demon     // cannot extend Demon, since it is final
//{
//	public void display()
//	{
//		System.out.println("hello");
//	}
//}

public class Final {

	public static void main(String[] args) {
		Demon d = new Demon();
		d.display();

	}

}
