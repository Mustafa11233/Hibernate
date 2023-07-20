package com.ait.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ait.entity.EmployeeEntity;
//error in persistence.xml
public class Tester {
	public static void main(String[] args) {
		//one global cache
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("test");
		
		//two local cache
		EntityManager em1 = factory.createEntityManager();
		EntityManager em2 = factory.createEntityManager();
		/*
		EmployeeEntity e1 = em1.find(EmployeeEntity.class,7788);
		System.out.println("===================================");
		
		try {
			Thread.sleep(25000);
		}catch(Exception e) {
			
		}

		EmployeeEntity e2 = em2.find(EmployeeEntity.class,7788);
		System.out.println("=======================================");
		EmployeeEntity e3 = em1.find(EmployeeEntity.class,7878);
		System.out.println("=======================================");
		EmployeeEntity e4 = em2.find(EmployeeEntity.class,7878);
		em1.close();
		em2.close();
		*/
		
		EntityManager em11 = factory.createEntityManager();
		TypedQuery<EmployeeEntity> query = em11.createQuery("SELECT e FROM EmployeeEntity e WHERE e.sal > ?1",EmployeeEntity.class);
		query.setParameter(1,5000.0);
		//by this data will be available in cache
		query.setHint("org.hibernate.cacheable",true);
		List<EmployeeEntity> lst = query.getResultList();
		//lst.forEach(System.out::println);
		em11.close();
		
		System.out.println("=================================");
		

		EntityManager em21 = factory.createEntityManager();
		TypedQuery<EmployeeEntity> query2 = em21.createQuery("SELECT e FROM EmployeeEntity e WHERE e.sal > ?1",EmployeeEntity.class);
		query2.setParameter(1,8000.0);
		query2.setHint("org.hibernate.cacheable",true);
		List<EmployeeEntity> lst2 = query2.getResultList();
		//lst2.forEach(System.out::println);
		em21.close();
		factory.close();
		
		
	}
}
