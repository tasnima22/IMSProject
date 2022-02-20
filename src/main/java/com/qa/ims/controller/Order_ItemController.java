package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.Order_ItemDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Order_item;
import com.qa.ims.utils.Utils;

public class Order_ItemController implements CrudController<Order_item>{

	public static final Logger LOGGER = LogManager.getLogger();

	private Order_ItemDAO order_itemDAO;
	private Utils utils;

	public Order_ItemController(Order_ItemDAO order_itemDAO, Utils utils) {
		super();
		this.order_itemDAO = order_itemDAO;
		this.utils = utils;
	}
	
	/** 
	 * 
	 * Read all the order_items
	 */
	@Override
	public List<Order_item> readAll() {
		List<Order_item> order_items = order_itemDAO.readAll();
		for (Order_item order_item : order_items) {
			LOGGER.info(order_items);
		}
		return order_items;
	}

	@Override
	public Order_item create() {
		LOGGER.info("Please enter Order ID");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter Product ID ");
		Long product_id = utils.getLong();
		LOGGER.info("Please enter quantity ");
		int quantity = utils.getInt();
		Order_item order_item = order_itemDAO.create(new Order_item(order_id, product_id, quantity));
		LOGGER.info("Customer created");
		return order_item;
	}

	@Override
	public Order_item update() {
		LOGGER.info("Please enter the id of the order item you would like to update");
		Long order_item_id = utils.getLong();
		LOGGER.info("Please enter order id");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter product id");
		Long product_id = utils.getLong();
		LOGGER.info("Please enter quantity");
		int quantity = utils.getInt();
		Order_item order_item = order_itemDAO.update(new Order_item(order_item_id, order_id, product_id, quantity));
		LOGGER.info("Order Item Updated");
		return order_item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order item you would like to delete");
		Long id = utils.getLong();
		return order_itemDAO.delete(id);
	} 
	

}
