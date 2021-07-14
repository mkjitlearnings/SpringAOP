package com.infogain.app1.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * <bean id="xyz"></bean>
 * 
 * */

@Component
@Scope("prototype")
public class Account {
		
	@Value("${account.Number}")    // Spring Expression Language
	private int accountNumber;
	
	@Value("ashish.bansal.74@gmail.com")
	private String accountHolderName;
	
	@Value("+919654144814")
	private long phoneNumber;
	
	@Value("#{2000+1500}")
	private int balance;
	private java.util.List<Policy> policy;
	
	
	
	@Autowired
	private Insurance insurance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" --- Inside Acount constructor --");
	}
	
	
	
	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Insurance getInsurance() {
		return insurance;
	}



	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}



	public Account(int accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public java.util.List<Policy> getPolicy() {
		return policy;
	}
	public void setPolicy(java.util.List<Policy> policy) {
		this.policy = policy;
	}



	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		
		System.out.println(" -->> Account Number Set operation called");
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String doAccountOperation()
	{
		return "operation -1";
	}



	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", policy=" + policy + ", insurance=" + insurance + "]";
	}


	public void doAccountInitTask()
	{
		System.out.println(" perform all mendatory task ");
	}
	
	public void doCLeanUpTask()
	{
		System.out.println(" Clean up memory resources ");
	}
	
	


}//end class


















