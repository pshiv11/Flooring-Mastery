package com.flooringmastery.main.dto;

import java.math.BigDecimal;

public class Order {

	int orderNumber;
	String customer;
	BigDecimal taxRate;
	String productType;
	BigDecimal area;
	BigDecimal materialCost;
	BigDecimal laborCost;
	BigDecimal tax;
	BigDecimal total;
	
	
	
	public Order(int orderNumber, String customer, BigDecimal taxRate, String productType, BigDecimal area,
			BigDecimal materialCost, BigDecimal laborCost, BigDecimal tax, BigDecimal total) {
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.taxRate = taxRate;
		this.productType = productType;
		this.area = area;
		this.materialCost = materialCost;
		this.laborCost = laborCost;
		this.tax = tax;
		this.total = total;
	}
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	public BigDecimal getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}
	public BigDecimal getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(BigDecimal laborCost) {
		this.laborCost = laborCost;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	
	
	
}
