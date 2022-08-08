package com.cognixia.jump.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String item;
	
	@Column
	private double price;
	
	@Column
	private int quantity;

	public Inventory(Integer id, String item, double price, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", item=" + item + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
