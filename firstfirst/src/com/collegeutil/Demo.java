package com.collegeutil;

import java.util.Scanner;

import com.companyOld.Company;
import com.companyOld.Student;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Company Deloitte = new Company();
		
		while(true)
		{
			System.out.println("Select one of the following options :");
			System.out.println("1. Add student");
			System.out.println("2. Display all students");
			System.out.println("3. Quit");
			System.out.print("Your option here : ");
			
			int input = sc.nextInt();
			
			if(input == 1)
			{
				sc.nextLine();
				
				System.out.println("Adding student ...");
				
				System.out.println("Enter student name :");
				String name = sc.nextLine();
				
				System.out.println("Enter department (i/e/a) :");
				char dept = sc.next().charAt(0);
				
				Student st = new Student(name, dept);
				
				Deloitte.addStd(st);
			}
			else if(input == 2)
			{
				System.out.println("Display students ...");
				Deloitte.displayAllStd();
			}
			else if(input == 3)
			{
				System.out.println("Stopped !");
				break;
			}
			else
			{
				System.out.println("Input a valid response");
			}
		}

	}

}
