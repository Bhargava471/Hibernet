package com.mouritech.manytomany;

import java.time.LocalDate;

import com.mouritech.manytomany.dao.ItemDao;
import com.mouritech.manytomany.dao.OrderDetailsDao;
import com.mouritech.manytomany.OrderDetails;
import com.mouritech.manytomany.Item;

public class ManyToMany {

	public static void main(String[] args) {
		// create employee
		OrderDetails order = new OrderDetails();
		
		order.setOrderId(555);
		order.setCustomer_id(101);
		order.setOrder_date(LocalDate.of(2022, 11, 10));
		order.setAmount(156L);
		
OrderDetails order1 = new OrderDetails();
		
		order1.setOrderId(556);
		order1.setCustomer_id(102);
		order1.setOrder_date(LocalDate.of(2009, 12, 25));
		order1.setAmount(99L);
		//create project
		Item item= new Item();
		item.setItemId(201L);
        item.setItemName("Tickle Me Elmo");
	    item.setItemdescription("It wants to be tickled");
		
		Item item1= new Item();
		item1.setItemId(202L);
        item1.setItemName("District 9 DVD");
	    item1.setItemdescription("Awesome sci-fi movie");
	    
		Item item2= new Item();
		item2.setItemId(203L);
        item2.setItemName("Batarang");
	    item2.setItemdescription("It is very Sharp");
		
		OrderDetailsDao ordao = new OrderDetailsDao();
		ordao.saveOrders(order);
		ordao.saveOrders(order1);
		
		ItemDao idao = new ItemDao();
		idao.saveProject(item);
		idao.saveProject(item1);
		idao.saveProject(item2);
	}

}