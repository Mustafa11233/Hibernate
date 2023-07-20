package com.ait.oto.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.oto.entities.Person;

public class PersonDaoImpl implements PersonDao {
	
	private EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("test");

	@Override
	public void savePerson(Person person) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(person);
			tx.commit();
			System.out.println("Person object is inserted");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Person record not inserted...");
		}finally {
			em.close();
		}
		
		
	}

	@Override
	public Person fetchPerson(Integer personId) {
		EntityManager em = factory.createEntityManager();
		Person person = em.find(Person.class,personId);
		em.close();
		
		return person;
	}

	@Override
	public void removePerson(Integer personId) {
		EntityManager em = factory.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		Person person = em.find(Person.class,personId);
		tx.begin();
		try {
			em.remove(person);
			tx.commit();
			System.out.println("Person obj is removed");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Person obj not deleted...");
		}finally {
			em.close();
		}
		
	}

}
