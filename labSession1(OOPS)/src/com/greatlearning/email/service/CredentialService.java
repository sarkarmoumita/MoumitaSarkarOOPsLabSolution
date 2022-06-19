package com.greatlearning.email.service;
import com.greatlearning.email.model.Employee;

public interface CredentialService {
	public void generatePassword(Employee emp);
	public void generateEmailAddress(Employee emp,String dept);
	public void showCredentials(Employee emp);
}
