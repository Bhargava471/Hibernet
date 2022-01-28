package com.mouritech.manytomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomany.Item;
import com.mouritech.manytomany.util.HibernateUtil;


public class ItemDao {
	public void saveProject(Item item) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(item);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public  Item getItem(Long itemid) {
		Transaction transaction = null;
		Item itemId = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
	
			transaction = session.beginTransaction();
		
			
			itemId = session.get(Item.class, itemid);
			if(itemId!=null) {
				
				System.out.println("Item details are = " + itemId);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return itemId;
		
	}
}