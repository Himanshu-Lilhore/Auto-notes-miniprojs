
class Person
{
	public void hasName()
	{
		System.out.println("has a name");
	}
	public void hasAge()
	{
		System.out.println("has an age");
	}
}

class Student extends Person
{
	public void hasRollNo()
	{
		System.out.println("has a roll no");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.hasAge();
		s.hasName();
		s.hasRollNo();

	}

}
