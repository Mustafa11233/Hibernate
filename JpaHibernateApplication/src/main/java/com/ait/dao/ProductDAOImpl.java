package com.ait.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {
	
	private EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("test");
	

	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println("Product is inserted to database...");
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Error in inserting a product..."+e);
		}finally {
			entityManager.close();
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		/*
		 * find() : early load
		 * getReference() : lazy load
		 */
		ProductEntity p=entityManager.find(ProductEntity.class,productId);
		entityManager.close();
		return p;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double new_UnitPrice) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p=entityManager.find(ProductEntity.class,productId);
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		p.setUnitPrice(new_UnitPrice);
		tx.commit();
		entityManager.close();
		return p;
	}

	@Override
	public void deleteById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p=entityManager.find(ProductEntity.class,productId);
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		entityManager.remove(p);
		tx.commit();
		entityManager.close();
		
		
		
	}

	@Override
	public void testEntityStates() {
		EntityManager entityManager = factory.createEntityManager();
		/*
		 * create a new product
		 */
		/*
		ProductEntity pe=new ProductEntity();//transient state
		pe.setProductId(2700);
		pe.setProductName("EarBuds");
		pe.setQuantity(5);
		pe.setUnitPrice(2400.00);
		*/
		ProductEntity pe= entityManager.find(ProductEntity.class, 2700);
		
		//pe entity is in persistent state
		
		/*
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
	
			entityManager.persist(pe);// persistent state
			tx.commit();
			*/
		entityManager.detach(pe);// detached state
		
		pe.setUnitPrice(3100.00);// The changes made to an entity
		                         //in detached state doesn't effect
		
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		entityManager.merge(pe);//moved from detached state to 
								//persistent state
		t.commit();
		entityManager.close();
	}

}
