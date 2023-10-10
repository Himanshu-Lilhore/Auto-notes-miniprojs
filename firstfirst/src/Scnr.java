import java.util.Scanner;

public class Scnr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String fname = sc.next();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter your marriage status : ");
		boolean isMarried = sc.nextBoolean();
		System.out.println("Hi " + fname + ", your age is " + age + ", earning " + salary + ", Married : " + isMarried);

	}

}
