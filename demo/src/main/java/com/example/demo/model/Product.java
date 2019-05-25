package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Product {
	
	@Id
	private int id;
	private String itemName;
	private String quantity;
	private String item_details; 
	
	public Product() {
			
	}

	
	public Product(int id, String itemName, String quantity, String item_details) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.quantity = quantity;
		this.item_details = item_details;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getItem_details() {
		return item_details;
	}


	public void setItem_details(String item_details) {
		this.item_details = item_details;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", itemName=" + itemName + ", quantity=" + quantity + ", item_details=" + item_details + "]";
	}
	
	

}
