package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudControler<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}
	
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}
	
	@Override
	public Order create() {
		LOGGER.info("Please enter the customer id");
		Long customerID = utils.getLong();
		LOGGER.info("Please enter the order items");
		List<Items> orderItems = utils.getList();
		LOGGER.info("Please enter the total price");
		Double totalPrice = utils.getDouble();
		Order order = orderDAO.create(new Order(orderItems, totalPrice, customerID));
		LOGGER.info("Order created");
		return order;
	}
	
	@Override
	public Order update() {
		LOGGER.info("Please enter the order id");
		Long orderID = utils.getLong();
		LOGGER.info("Please enter the order items");
		List<Items> orderItems = utils.getList();
		LOGGER.info("Please enter the total price");
		Double totalPrice = utils.getDouble();
		Order order = orderDAO.update(new Order(orderItems, totalPrice, customerID));
		LOGGER.info("Order updated");
		return order;
	}
	
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order that you would like to delete");
		Long orderID = utils.getLong();
		return orderDAO.delete(orderID);
	}
}
