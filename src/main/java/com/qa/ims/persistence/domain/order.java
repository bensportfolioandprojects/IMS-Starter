package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {
	
	private Long orderID;
	private List<Item> orderItems;
	private Double totalPrice;
	private Long customerID;
	
	public Order(List<Item> orderItems, Double totalPrice, Long customerID) {
		this.setOrderItems(orderItems);
		this.setTotalPrice(totalPrice);
		this.setCustomerID(customerID);
	}
	
	public Order(Long orderID, List<Item> orderItems, Double totalPrice, Long customerID) {
		this.setOrderID(orderID);
		this.setOrderItems(orderItems);
		this.setTotalPrice(totalPrice);
		this.setCustomerID(customerID);
	}
	
	public Long getOrderID() {
		return orderID;
	}
	
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	
	public List<Item> getOrderItems() {
		return orderItems;
	}
	
	public void setOrderItems(List<Item> orderItems) {
		this.orderItems = orderItems;
	}
	
	public Double getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Long getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (getOrderID() == null) {
			if (other.getOrderID() != null)
				return false;
		} else if (!getOrderID().equals(other.getOrderID()))
			return false;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice)) {
			return false;
		} {
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID)) 
			return false;
		return true;
	}
	}
	}
