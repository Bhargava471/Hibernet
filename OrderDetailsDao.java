package com.mouritech.manytomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomany.OrderDetails;
import com.mouritech.manytomany.util.HibernateUtil;



public class OrderDetailsDao {
	public void saveOrders(OrderDetails orderId) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(orderId);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public OrderDetails getOrders(int orderId) {
		Transaction transaction = null;
		OrderDetails ordById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
		
			
			//get entity from database
			ordById = session.get(OrderDetails.class, orderId);
			if(ordById!=null) {
				
				System.out.println("Order details are = " + ordById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return ordById;
		
	}
	}
