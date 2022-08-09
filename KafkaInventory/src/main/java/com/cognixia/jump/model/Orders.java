package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;


public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String item;

	private Date dateOfPurchase;

	private int quantity;
	
	public Orders() {
		this(null, "N/A", new Date(), 0);
	}

	public Orders(Integer id, String item, Date dateOfPurchase, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.dateOfPurchase = dateOfPurchase;
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

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", item=" + item + ", dateOfPurchase=" + dateOfPurchase + ", quantity=" + quantity
				+ "]";
	}
	
	

}
