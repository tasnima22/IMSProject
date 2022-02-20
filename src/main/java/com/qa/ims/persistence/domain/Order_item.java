package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order_item {

	private Long order_item_id;
	private Long order_id;
	private Long product_id;
	private int quantity;
	
	public Order_item(Long order_id, Long product_id, int quantity) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	
	public Order_item(Long order_item_id, Long order_id, Long product_id, int quantity) {
		super();
		this.order_item_id = order_item_id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}


	public Long getOrder_item_id() {
		return order_item_id;
	}


	public void setOrder_item_id(Long order_item_id) {
		this.order_item_id = order_item_id;
	}


	public Long getOrder_id() {
		return order_id;
	}


	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}


	public Long getProduct_id() {
		return product_id;
	}


	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public int hashCode() {
		return Objects.hash(order_id, order_item_id, product_id, quantity);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order_item other = (Order_item) obj;
		return Objects.equals(order_id, other.order_id) && Objects.equals(order_item_id, other.order_item_id)
				&& Objects.equals(product_id, other.product_id) && quantity == other.quantity;
	}
	
	
	
}



//foreign keys involved with order_id and product_id (which is the id)