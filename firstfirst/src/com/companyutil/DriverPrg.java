package com.companyutil;

import java.util.*;
import com.company.*;

public class DriverPrg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Company deloitte = new Company();
		
		
		while(true)
		{
			System.out.println("\nSelect one of the following --");
			System.out.println("1. Add Employee");
			System.out.println("2. Dispaly All Employee");
			System.out.println("3. Quit");
			System.out.print("Your choice : ");
			
			int choice = sc.nextInt();
			boolean check;
			
			if(choice == 1)
			{
				Employee e = new Employee();
				
				System.out.println("\nEnter employee details --");
				
				String name;
				String id;
				float salary;
				char dept;
				
				System.out.print("Employee name : ");
				sc.nextLine();
				name = sc.nextLine();
				e.setEmpName(name);
				
				System.out.print("Employee ID : ");
				id = sc.nextLine();
				check = e.setEmpID(id);
				if(!check)
					break;
				
				System.out.print("Salary : ");
				salary = sc.nextFloat();
				e.setSalary(salary);
				
				System.out.print("Department (I/F/A) : ");
				sc.nextLine();
				dept = sc.nextLine().charAt(0);
				check = e.setDepartment(dept);
				if(!check)
					break;
				
				deloitte.addEmp(e);
				
			}
			else if(choice == 2)
			{
				System.out.println("Displaying all 1"
						+ "info --");
				deloitte.displayAllEmp();
			}
			else if(choice == 3)
			{
				break;
			}
			else
			{
				System.out.println("Invalid Input");
			}
			
		}
		

	}

}
