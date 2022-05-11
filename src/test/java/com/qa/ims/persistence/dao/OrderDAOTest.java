package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.qa.ims.utils.DBUtils;
import com.sun.tools.javac.util.List;

public class OrderDAOTest {
	
	private final OrderDAO DAO = new OrderDAO();
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testCreate() {
		final Order created = new Order(2L, "bird_table", 40.00, 2);
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Order> expected = new ArrayList<>();
		expected.add(new Order(1L, "plant_pot", 20.00, 1));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test
	public void testReadLatest() {
		assertEquals(new Order(1L, "plant_pot", 20.00), DAO.readLatest());
	}
	
	@Test
	public void testRead() {
		final long OrderID = 1L;
		assertEquals(newOrder(OrderID, "plant_pot", 20.00))
	}

}
