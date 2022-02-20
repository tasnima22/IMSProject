package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {

	private final OrderDAO DAO = new OrderDAO();
	
	@Before 
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test 
	public void testCreate() {
		final Orders created = new Orders(6L, 6L, 2022-02-21, 86.00);
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Orders> expected = new ArrayList<>();
		expected.add(new Orders(3L, 3L, 2022-02-18, 32.45));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test 
	public void testReadLatest() {
		assertEquals(new Orders(4L, 4L, 2022-02-18, 34.99), DAO.readLatest());
		
	}
	
	@Test
	public void testRead() {
		final long Order_id = 1L;
		assertEquals(new Orders(Order_id, 1L, 2022-02-17, 25.50), DAO.read(Order_id);
		
	}
	
	@Test
	public void testUpdate() {
		final Orders updated = new Orders(3L, 3L, 2022-02-18, 24.99);
		assertEquals(updated, DAO.update(updated));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}

