package com.flooringmastery.main.dto;

import java.math.BigDecimal;

public class Tax {

	String stateAbb;
	String stateName;
	BigDecimal taxRate;
	
	public Tax() {
		//empty arg constructor
	}
	
	public Tax(String stateAbb, String stateName, BigDecimal taxRate) {
		this.stateAbb = stateAbb;
		this.stateName = stateName;
		this.taxRate = taxRate;
	}



	public String getStateAbb() {
		return stateAbb;
	}
	public void setStateAbb(String stateAbb) {
		this.stateAbb = stateAbb;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	
	
}
