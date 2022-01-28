package com.mouritech.manytomany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "employee_data")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "customer_id")
	private int customerid;
	
	@Column(name = "order_date")
	private LocalDate orderdate;
	
	@Column(name = "amount")
	private Long amount;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "order_items",joinColumns = {@JoinColumn(name = "order_id")},
					inverseJoinColumns = {@JoinColumn(name = "item_id")})
	Set<Item> Items = new HashSet<Item>();
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(int orderId, Long customer_id, LocalDate order_date, Long amount) {
		super();
		this.orderId = orderId;
		this.customerid = customerid;
		this.orderdate = orderdate;
		this.amount = amount;
	}
	public OrderDetails(int customerid, LocalDate orderdate, Long amount) {
		super();
		this.customerid = customerid;
		this.orderdate = orderdate;
		this.amount= amount;
	}
	
     
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int i) {
		this.orderId = i;
	}
	public int getCustomer_id() {
		return customerid;
	}
	public void setCustomer_id(int customerid) {
		this.customerid = customerid;
	}
	public LocalDate getOrder_date() {
		return orderdate;
	}
	public void setOrder_date(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Order [orederId=" + orderId + ", customerId=" + customerid + ", OrderDate=" + orderdate
				+ ", amount=" + amount + "]";
	}
	
	
	




	
	
 
}