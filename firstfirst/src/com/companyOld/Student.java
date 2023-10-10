package com.companyOld;

public class Student {
	private String stdID;
	private String stdName;
	private char Department;
	private static int serial = 1;
	
	public String getStdID() {
		return stdID;
	}
	public void setStdID(String stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public char getDepartment() {
		return Department;
	}
	public void setDepartment(char department) {
		String st = "" + department;
		if(!"AIEaie".contains(st))
		{
			System.out.println("Enter a vaild department !!");
		}
		else
		{
			this.Department = department;
		}
	}
	
	public Student(String name, char dept)
	{
		setStdName(name);
		setDepartment(dept);
		
		int zeroes = 5 - (int)Math.floor(Math.log10(serial) + 1);
		String z = "";
		for(int i = 0; i<zeroes; i++)
		{
			z = z + "0";
		}
		
		setStdID("DEL" + z + serial);
		serial++;
	}
	
	
}
