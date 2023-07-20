package com.ait.client;

import com.ait.dao.ProductDAO;
import com.ait.dao.ProductDAOImpl;
import com.ait.entity.ProductEntity;

public class Tester {
	public static void main(String[] args) {
		
		ProductDAO dao=new ProductDAOImpl();
		/*
		 * create a new product entity
		 */
		ProductEntity pEntity =new ProductEntity();
		
		pEntity.setProductId(129011);
		pEntity.setProductName("LAPTOP");
		pEntity.setQuantity(12);
		pEntity.setUnitPrice(38000.00);
		
		/*
		 * call saveProduct() of DAO class
		 */
		//dao.saveProduct(pEntity);
		
		/*
		 * call updateProductById() of DAO class
		 */
	//	ProductEntity p = dao.updateProductById(129011, 56000.00);
	//	System.out.println(p);
		/*
		 * call deleteById() of DAO class
		 */
		//dao.deleteById(129011);
		/*
		 * call loadProductById() of DAO class
		 */
		//ProductEntity p = dao.loadProductById(101);
		//System.out.println(p);
		
		dao.testEntityStates();
		
	}

}
