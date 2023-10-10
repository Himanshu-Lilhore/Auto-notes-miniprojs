package com.companyOld;

import java.util.*;

import com.companyOld.Student;

public class Company {
	ArrayList studentDetails = new ArrayList();
	
	public void addStd(Student e)
	{
//		studentDetails.add(e.getStdID() + "\n" + 
//				e.getStdName() + "\n" +
//				e.getDepartment());
		
		studentDetails.add(e);    //exp
		
	}
	
	public void displayAllStd()
	{
//		Iterator it = studentDetails.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		//exp
		Iterator it = studentDetails.iterator();
		while(it.hasNext())
		{
			System.out.println(((Student)it.next()).getStdID());
		}
	}
}
