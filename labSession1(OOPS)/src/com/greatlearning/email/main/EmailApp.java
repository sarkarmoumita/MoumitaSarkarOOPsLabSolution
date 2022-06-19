package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;
import com.greatlearning.email.model.Employee;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    CredentialService service=new CredentialServiceImpl();
		Employee emp=new Employee("Moumita","Sarkar");
		Scanner sc=new Scanner(System.in);
		
			// TODO Auto-generated method stub
			System.out.println("Please enter the department from the following");
			System.out.println("Press 1 for Technical");
			System.out.println("Press 2 for Adminl");
			System.out.println("Press 3 for Human Resource");
			System.out.println("Press 4 for Legal");
			int deptid=sc.nextInt();
			String dept="";
			switch(deptid)
			{
			case 1:dept="tech";
			       break;
			case 2:dept="admin";
			       break;
			case 3:dept="hr";
			       break;
			case 4:dept="legal";
			       break;
			}
			emp.setDept(dept);
			
			service.generateEmailAddress(emp,dept);
			service.generatePassword(emp);
			service.showCredentials(emp);

		}

	}


