package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Products {

	private Long id;
	private String name;
	private Double cost;
	
	public Products(Long id, String name, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public Products(String name, Double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "id:" + id + " product name:" + name + "cost" + cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
	}
