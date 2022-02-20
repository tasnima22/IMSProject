
package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.qa.ims.controller.ProductController;
import com.qa.ims.persistence.dao.ProductDAO;
import com.qa.ims.persistence.domain.Products;
import com.qa.ims.utils.Utils;

public class ProductControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private ProductDAO dao;

	@InjectMocks
	private ProductController controller;

	@Test
	public void testCreate() {
		final String Product_name = "GTA 5";
		final Double Product_cost = 32.90;
		final Products created = new Products(Product_name, Product_cost);

		Mockito.when(utils.getString()).thenReturn(Product_name);
		Mockito.when(utils.getDouble()).thenReturn(Product_cost);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test
	public void testReadAll() {
		List<Products> product = new ArrayList<>();
		product.add(new Products(1L, "Call of Duty", 29.99));

		Mockito.when(dao.readAll()).thenReturn(product);

		assertEquals(product, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
		Products updated = new Products(1L, "Call of Duty", 29.99);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(updated.getName());
		Mockito.when(this.utils.getDouble()).thenReturn(updated.getCost());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}

}
