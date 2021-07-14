package com.infogain.app1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MedicalInsurance implements Insurance {

	private int amount;
	@Value("Medical Insurance 101")
	private String insuranceName;
	
	public int payPremium() {
		// TODO Auto-generated method stub
		return 800;
	}

}
