package com.infogain.app1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insurance {

	@Value("9595")
	private int insurancePremium;
	private int insuranceNumber;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInsurancePremium() {
		return insurancePremium;
	}
	public void setInsurancePremium(int insurancePremium) {
		this.insurancePremium = insurancePremium;
	}
	public int getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	
}
