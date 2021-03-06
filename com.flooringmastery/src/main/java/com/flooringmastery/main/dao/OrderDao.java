package com.flooringmastery.main.dao;

import java.time.LocalDate;
import java.util.List;

import com.flooringmastery.main.dto.Order;

public interface OrderDao {

	Order getOrder(LocalDate date, int orderId);
	
	Order addOrder(LocalDate date, int orderId, Order order);
	
	Order removeOrder(LocalDate date, int orderId);
	
	Order editOrder(LocalDate date, int orderId);
	
	List<Order> getOrdersFor(LocalDate date);
	
	List<Order> getAllOrders();
		
}
