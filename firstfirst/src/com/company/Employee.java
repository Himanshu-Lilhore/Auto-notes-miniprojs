package com.company;

public class Employee {
	
	private String empID;
	private String empName;
	private float Salary;
	private char Department;
	
	public String getEmpID() {
		return empID;
	}
	public boolean setEmpID(String empID) {
		if(empID.charAt(0) == 'D' && 
		   empID.charAt(1) == 'E' && 
		   empID.charAt(2) == 'L')
		{
			this.empID = empID;
			return true;
		}
		else
		{
			System.out.println("Employee ID is not in format DELxxxxx");
			return false;
		}
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public char getDepartment() {
		return Department;
	}
	public boolean setDepartment(char department) {
		String st = department + "";
		if("IFAifa".contains(st))
		{
			Department = department;
			return true;
		}
		else
		{
			System.out.println("Invalid department entered !");
			return false;
		}
	}
	
	
}
