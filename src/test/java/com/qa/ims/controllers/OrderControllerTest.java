package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrdersController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Mock
	private Utils utils;
	
	@Mock
	private OrderDAO dao;
	
	@InjectMocks
	private OrdersController controller;
	
	@Test
	public void testCreate() {
		final Long customer_id = 1L;
		final Date date_of_order = new Date(2022-02-19);
		final Double totalcost = 25.50;
		final Orders created = new Orders(customer_id, date_of_order, totalcost);
		
		Mockito.when(utils.getLong()).thenReturn(customer_id);
		Mockito.when(utils.getDate()).thenReturn(date_of_order);
		Mockito.when(utils.getDouble()).thenReturn(totalcost);
		
		assertEquals(created, controller.create());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getDate();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test 
	public void testReadAll() {
		List<Orders> order = new ArrayList<>();
		order.add(new Orders(4L, 4L, new Date(2022-02-18), 34.99));
		
		Mockito.when(dao.readAll()).thenReturn(order);
		
		assertEquals(order, controller.readAll());
		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
	@Test 
	public void testUpdate() {
		Orders updated = new Orders(1L, 1L, 2022-02-19, 26.00);
		
		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getLong()).thenReturn(updated.getCustomer_id());
		Mockito.when(this.utils.getDate()).thenReturn(updated.getDate_of_order());
		Mockito.when(this.utils.getDouble()).thenReturn(updated.getTotalcost());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);
		
		assertEquals(updated, this.controller.update());
		
		Mockito.verify(this.utils, Mockito.times(2)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getDate();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
		
	}
	
	@Test 
	public void testDelete() {
		final long order_id = 1L;
		
		Mockito.when(utils.getLong()).thenReturn(order_id);
		Mockito.when(dao.delete(order_id)).thenReturn(1);
		
		assertEquals(1L, this.controller.delete());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(order_id);
	}
}
