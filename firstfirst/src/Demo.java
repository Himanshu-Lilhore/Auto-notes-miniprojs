class Book
{
	private int pageno;
	
	public void setPageno(int a)
	{
		if(a > 0)
		{
			pageno = a;
		}
		else
		{
			System.out.println("Invalid page no.");
		}
	}
	
	public void getPageno()
	{
		System.out.println(pageno);
	}
}

class GeneralBuilding
{
	int noOfFloors;
	int noOfRooms;
	String buildingName;
	int length;
	int width;
	
	GeneralBuilding(int noOfFloors, int noOfRooms, String buildingName, int length, int width)
	{
		this.noOfFloors = noOfFloors;
		this.noOfRooms = noOfRooms;
		this.buildingName = buildingName;
		this.length = length;
		this.width = width;
	}
	
	public void displayDetails()
	{
		System.out.println(this.noOfFloors);
		System.out.println(this.noOfRooms);
		System.out.println(this.buildingName);
		System.out.println(this.length);
		System.out.println(this.width);
	}
}

public class Demo {

	public static void main(String[] args) {
		System.out.println("HI");
		String name = "Himanshu";
		int age = 22;
		double sal = 25000.00;
		boolean hasLaptop = true;
		System.out.println("Name :  " + name);
		System.out.println("Age : " + age);
		System.out.println(sal);
		System.out.println(hasLaptop);
		
		// byte, short, int , long
		
		// float, double
		
		// implicit type casting : smaller to larger data type
		
		// explicit type casting : when we have to explicitly type cast when converting from larger to smaller data type
		short a = 130;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
		
		// OOP:
		GeneralBuilding bangalore = new GeneralBuilding(10, 40, "Springdale", 10000, 10000);
		GeneralBuilding hyderabad = new GeneralBuilding(8, 30, "Skyview", 8000, 8000);
		GeneralBuilding chennai = new GeneralBuilding(7, 35, "Ivanshika", 5000, 5000);
		
		bangalore.displayDetails();
		hyderabad.displayDetails();
		chennai.displayDetails();
		
		// encapsulation:
		Book buk = new Book();
		buk.setPageno(-100);
		buk.getPageno();
		
	}

}
