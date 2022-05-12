package com.qa.ims.persistence.domain;

import java.util.List;
import java.util.Objects;

public class Order {
	
	private Long id;
	private List<Item> orderItems;
	private Long customerID;
	
	

	public Order(Long id, List<Item> orderItems, Long customerID) {
		super();
		this.id = id;
		this.orderItems = orderItems;
		this.customerID = customerID;
	}

	public Order(Long customerID) {
		super();
		this.customerID = customerID;
	}
	
	public Order(List<Item> orderItems, Long customerID) {
		super();
		this.orderItems = orderItems;
		this.customerID = customerID;
	}

	public Order(Long id, Long customerID) {
		super();
		this.id = id;
		this.customerID = customerID;
	}

	public Long getID() {
		return id;
	}

	public void setID(Long id) {
		this.id = id;
	}

	public List<Item> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Item> orderItems) {
		this.orderItems = orderItems;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerID, id, orderItems);
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
		return Objects.equals(customerID, other.customerID) && Objects.equals(id, other.id)
				&& Objects.equals(orderItems, other.orderItems);
	}

	@Override
	public String toString() {
		return "Order [orderID=" + id + ", orderItems=" + orderItems + ", customerID=" + customerID + "]";
	}
	
	
	
	
	}
