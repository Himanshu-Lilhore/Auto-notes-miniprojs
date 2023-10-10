package com.company;
import java.util.*;

import com.companyOld.Student;

public class Company {
	ArrayList data = new ArrayList();
	
	public void addEmp(Employee e)
	{
		data.add(e.getEmpID() + "\n" + e.getEmpName() + "\n" + e.getDepartment() + "\n" + e.getSalary());
	}
	
	public void displayAllEmp()
	{
		Iterator it = data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
