package com.infogain.app1.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infogain.app1.bean.Account;


public class MainRunner {

	public static void main(String[] args) {
		
		// Initialize the Spring
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		Account account = (Account)spring.getBean("account");
		System.out.println(account);
		
		
	
		spring.close();
	}//end main
}//end class
