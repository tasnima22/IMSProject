package com.qa.ims.persistence.domain;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

public class Orders {

	private Long order_id;
	private Long customer_id; 
	private Date date_of_order;
	private Double totalcost;
	
	
	public Orders(Long order_id, Long customer_id, Date date_of_order, Double totalcost) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.date_of_order = date_of_order;
		this.totalcost = totalcost;
	}


	public Long getOrder_id() {
		return order_id;
	}


	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}


	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}


	public Date getDate_of_order() {
		return date_of_order;
	}


	public void setDate_of_order(Date date_of_order) {
		this.date_of_order = date_of_order;
	}


	public Double getTotalcost() {
		return totalcost;
	}


	public void setTotalcost(Double totalcost) {
		this.totalcost = totalcost;
	}


	@Override
	public int hashCode() {
		return Objects.hash(customer_id, date_of_order, order_id, totalcost);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(customer_id, other.customer_id) && Objects.equals(date_of_order, other.date_of_order)
				&& Objects.equals(order_id, other.order_id) && Objects.equals(totalcost, other.totalcost);
	}
	
	
	
}


//foreign keys involved with customer_id (which is the id)


