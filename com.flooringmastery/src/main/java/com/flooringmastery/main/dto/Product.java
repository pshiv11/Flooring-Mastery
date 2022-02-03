package com.flooringmastery.main.dto;

import java.math.BigDecimal;

public class Product {
	int productId;
	String productType;
	BigDecimal costPerSquareFoot;
	BigDecimal LaborcostPerSquareFoot;
	
	public Product(int productId, String productType, BigDecimal costPerSquareFoot, BigDecimal laborcostPerSquareFoot) {
		this.productId = productId;
		this.productType = productType;
		this.costPerSquareFoot = costPerSquareFoot;
		LaborcostPerSquareFoot = laborcostPerSquareFoot;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getCostPerSquareFoot() {
		return costPerSquareFoot;
	}

	public void setCostPerSquareFoot(BigDecimal costPerSquareFoot) {
		this.costPerSquareFoot = costPerSquareFoot;
	}

	public BigDecimal getLaborcostPerSquareFoot() {
		return LaborcostPerSquareFoot;
	}

	public void setLaborcostPerSquareFoot(BigDecimal laborcostPerSquareFoot) {
		LaborcostPerSquareFoot = laborcostPerSquareFoot;
	}

	public int getProductId() {
		return productId;
	}
	
	
	
	
	
}
