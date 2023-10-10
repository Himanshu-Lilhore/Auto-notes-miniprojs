
class College
{
	public void about()
	{
		System.out.println("College name is UIT");
	}
	
	class Department
	{
		public void about()
		{
			System.out.println("It contains many departments");
		}
	}
}

public class InnerClass {

	public static void main(String[] args)
	{
		College c = new College();
		c.about();
		College.Department d = c.new Department();
		d.about();

	}

}