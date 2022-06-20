package com.greatlearning.email.model;


	public class Employee {

		private String firstName;
		private String lastName;
		private String dept;
		private String email;
		private String password;
	    public final static String company="abc";
		
	    public	Employee(String firstName,String lastName)
	    {
	    	this.firstName=firstName;
	    	this.lastName=lastName;
		}
	    public void setDept(String dept)
	    {
	    	this.dept=dept;
	    }
	    public String getFirstName()
	    {
	         return firstName;
	    }
	    public String getLastName()
	    {
	         return lastName;
	    }
	    public String dept()
	    {
	         return dept;
	    }
	    public void setEmail(String email)
	    {
	         this.email=email;
	    }
	    public String getEmail()
	    {
	    	return(email);
	    }
	    public void setPassword(String password)
	    {
	         this.password=password;
	    }
	    public String getPassword()
	    {
	        return password;
	    }
	    
	    
	}


