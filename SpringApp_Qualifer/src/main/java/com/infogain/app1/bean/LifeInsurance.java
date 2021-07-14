package com.infogain.app1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class LifeInsurance implements Insurance {

	
	@Value("#{account101.balance* 0.01}")
	private int amount;  // balance of Acount  (0.5%)
	@Value("Life Insurance 101")
	private String insuranceName;
	
	
	public int payPremium() {
		// TODO Auto-generated method stub
		return amount;
	}
	
	

}
