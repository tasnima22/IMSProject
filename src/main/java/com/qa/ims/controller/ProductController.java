package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ProductDAO;
import com.qa.ims.persistence.domain.Products;
import com.qa.ims.utils.Utils;

/**
 * 
 * Takes in product details for CRUD functionality
 * 
 */

public class ProductController implements CrudController<Products> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private ProductDAO productDAO;
	private Utils utils;

	public ProductController(ProductDAO productDAO, Utils utils) {
		super();
		this.productDAO = productDAO;
		this.utils = utils;
	}
	
	/**
	 * Reads all products to the logger
	 */
	@Override
	public List<Products> readAll() {
		List<Products> products = productDAO.readAll();
		for (Products product : products) {
			LOGGER.info(product);
		}
		return products;
	}
	
	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Products create() {
		LOGGER.info("Please enter product name");
		String name = utils.getString();
		LOGGER.info("Please enter the cost of the product");
		Double cost = utils.getDouble();
		Products product = productDAO.create(new Products(name, cost));
		LOGGER.info("product created");
		return product;
	}

	/**
	 * Updates an existing product by taking in user input
	 */
	@Override
	public Products update() {
		LOGGER.info("Please enter the id of the product you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter product name");
		String name = utils.getString();
		LOGGER.info("Please the cost of the product");
		Double cost = utils.getDouble();
		Products product = productDAO.update(new Products(id, name, cost));
		LOGGER.info("Product Updated");
		return product;
	}

	/**
	 * Deletes an existing product by the id of the product
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the product you would like to delete");
		Long id = utils.getLong();
		return productDAO.delete(id);
	}
}
