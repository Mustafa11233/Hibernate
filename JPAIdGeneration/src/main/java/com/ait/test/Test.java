package com.ait.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.entities.DemoEntity;

public class Test {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			
		EntityManager em = factory.createEntityManager();
		
		DemoEntity demo =new DemoEntity();
		//demo.setId(1010);
		demo.setName("AA");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(demo);
		tx.commit();
		em.close();
		
		factory.close();
		
	}

}
