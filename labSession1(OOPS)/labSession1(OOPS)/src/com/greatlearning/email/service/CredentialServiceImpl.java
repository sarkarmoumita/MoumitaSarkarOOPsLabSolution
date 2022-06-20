package com.greatlearning.email.service;


import java.util.Random;
import java.util.Scanner;
import com.greatlearning.email.model.Employee;
public class CredentialServiceImpl implements CredentialService{
	Scanner sc=new Scanner(System.in);
	//Employee emp=new Employee("Harshit","Chaudhury");
	
	//String company="abc";
	
	
	public void generateEmailAddress(Employee emp,String dept)
	{
		
		String email=emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+dept+"."+Employee.company+".com";
		emp.setEmail(email);
	}
	public void generatePassword(Employee emp)
	{
		Random random=new Random();
		String capitalletters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_letters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String special_ch="!@#$%^*_=+-/.?<>P)";
		String passwordRange=capitalletters+small_letters+numbers+special_ch;
		String password="";
		for(int i=0;i<8;i++)
		{
			password=password+passwordRange.charAt(random.nextInt(passwordRange.length()));
		}
		//String 
		//System.out.print(password);
		emp.setPassword(password);
		
		
	}
	public void showCredentials(Employee emp)
	{
		System.out.println("Dear "+emp.getFirstName()+", your generated credentials are as follows:");
		System.out.println("Email-->"+ emp.getEmail());
		System.out.println("Password-->"+ emp.getPassword());
	}

}
