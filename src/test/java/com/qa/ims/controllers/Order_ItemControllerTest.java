package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrdersController;
import com.qa.ims.persistence.dao.Order_ItemDAO;
import com.qa.ims.persistence.domain.Order_item;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)

public class Order_ItemControllerTest {
	
		@Mock
		private Utils utils;

		@Mock
		private Order_ItemDAO dao;

		@InjectMocks
		private OrdersController controller;

		@Test
		public void testCreate() {
			final Long Order_id = 1L, Product_id = 1L;
			final int Quantity = 2;
			final Order_item created = new Order_item(Order_id, Product_id, Quantity);

			Mockito.when(utils.getLong()).thenReturn(Order_id, Product_id);
			Mockito.when(utils.getInt()).thenReturn(Quantity);
			Mockito.when(dao.create(created)).thenReturn(created);

			assertEquals(created, controller.create());

			Mockito.verify(utils, Mockito.times(2)).getLong();
			Mockito.verify(utils, Mockito.times(1)).getInt();
			Mockito.verify(dao, Mockito.times(1)).create(created);
		}

		@Test
		public void testReadAll() {
			List<Order_item> order_items = new ArrayList<>();
			order_items.add(new Order_item(1L, 1L, 2));

			Mockito.when(dao.readAll()).thenReturn(order_items);

			assertEquals(order_items, controller.readAll());

			Mockito.verify(dao, Mockito.times(1)).readAll();
		}

		@Test
		public void testUpdate() {
			Order_item updated = new Order_item(1L, 1L, 1L, 3);

			Mockito.when(this.utils.getLong()).thenReturn(1L);
			Mockito.when(this.utils.getLong()).thenReturn(updated.getOrder_id(), updated.getProduct_id());
			Mockito.when(this.utils.getInt()).thenReturn(updated.getQuantity());
			Mockito.when(this.dao.update(updated)).thenReturn(updated);

			assertEquals(updated, this.controller.update());

			Mockito.verify(this.utils, Mockito.times(3)).getLong();
			Mockito.verify(this.utils, Mockito.times(1)).getInt();
			Mockito.verify(this.dao, Mockito.times(1)).update(updated);
		}

		@Test
		public void testDelete() {
			final long Order_item_id = 1L;

			Mockito.when(utils.getLong()).thenReturn(Order_item_id);
			Mockito.when(dao.delete(Order_item_id)).thenReturn(1);

			assertEquals(1L, this.controller.delete());

			Mockito.verify(utils, Mockito.times(1)).getLong();
			Mockito.verify(dao, Mockito.times(1)).delete(Order_item_id);
		}

}
	

