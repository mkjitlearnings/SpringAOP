package com.infogain.app1.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infogain.app1.bean.Account;
import com.infogain.app1.bean.Person;


public class MainRunner {

	public static void main(String[] args) {
		
		// Initialize the Spring
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		
		  Account account = (Account)spring.getBean("account");
		  System.out.println(account);
		  System.out.println("Pay Premium :- "+account.getInsurance().payPremium());
		  
		  System.out.println(" "+account.isMinBalance());
		 
	
		
		//	Person p =(Person)spring.getBean("person");
		//	System.out.println(p.getX()+" "+p.getY());
		spring.close();
	}//end main
}//end class
