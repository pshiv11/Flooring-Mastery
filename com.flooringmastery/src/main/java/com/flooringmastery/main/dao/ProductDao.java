package com.flooringmastery.main.dao;

import java.math.BigDecimal;
import java.util.List;

import com.flooringmastery.main.dto.Product;

public interface ProductDao {
	
	Product addProduct(int productId, Product product);
	
	Product removeProduct(int productId);
	
	Product editProduct(int productId);
	
	Product getProduct(int productId);
	
	List<Product> getAllProducts();
	
	
	
	/*
	 * We will also add private methods in out Impl class to marshall and unmarshall product data
	 * from a text file
	 */
	
	
}
