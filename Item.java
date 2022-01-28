package com.mouritech.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_data")
public class Item {
	
	@Id
	@GeneratedValue
	@Column(name = "item_id")
	private Long itemId;
	
	@Column(name="itemname")
	private String itemName;
	
	@Column(name="itemdescription")
	private String itemdescription;
	@ManyToMany(mappedBy = "items",cascade = {CascadeType.ALL})
	private Set<OrderDetails> orders = new HashSet<OrderDetails>();
	
	
    public Item() {
	
    }
	public Item(Long itemId, String itemName, String itemdescription, Set<OrderDetails> orders) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemdescription = itemdescription;
		this.orders = orders;
	}


	public Item(String itemName, String itemdescription) {
		super();
		this.itemName = itemName;
		this.itemdescription= itemdescription;
	}

	public Long getItemtId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemdescription() {
		return itemdescription;
	}


	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}


	public Set<OrderDetails> getOrders() {
		return orders;
	}


	public void setOrders(Set<OrderDetails> orders) {
		this.orders = orders;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemdescription=" + itemdescription + "]";
	}
	
	
	

}