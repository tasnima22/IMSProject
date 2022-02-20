package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order_item;
import com.qa.ims.utils.DBUtils;

public class Order_itemDAOTest {
	
	private final Order_ItemDAO DAO = new Order_ItemDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test 
	public void testCreate() {
		final Order_item created = new Order_item(1L, 1L, 1L, 2); 
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Order_item> expected = new ArrayList<>();
		expected.add(new Order_item(1L, 1L, 1L, 2));
		assertEquals(expected, DAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Order_item(1L, 1L, 1L, 2), DAO.readLatest());
	}

	@Test
	public void testRead() {
		final long Order_item_id = 1L;
		assertEquals(new Order_item(Order_item_id, 1L, 1L, 2), DAO.read(Order_item_id));
	}

	@Test
	public void testUpdate() {
		final Order_item updated = new Order_item(1L, 1L, 1L, 2);
		assertEquals(updated, DAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
	
}
