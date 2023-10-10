
class Parent
{
	String name;
	double salary;
	
	Parent(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public void greeting()
	{
		System.out.println("I'm a parent class");
	}
	
	public void display()
	{
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
	}
	
}

class Child extends Parent
{
	int age;
	
	Child(String name, int salary, int age)
	{
		super(name, salary);
		this.age = age;
	}
	
	//overriding
	public void greeting()
	{
		System.out.println("I'm a child class");
	}
	
	//super
	public void parentGreeting()
	{
		super.greeting();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Age : " + this.age);
	}
}

public class Overriding {

	public static void main(String[] args) {
		Parent p = new Parent("papa", 100000);
		Child c = new Child("himanshu", 2000, 22);
		p.greeting();
		c.greeting();
		c.parentGreeting();
		p.display();
		c.display();
	}

}
