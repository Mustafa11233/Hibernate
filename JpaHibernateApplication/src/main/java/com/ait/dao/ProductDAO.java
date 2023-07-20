package com.ait.dao;

import com.ait.entity.ProductEntity;

public interface ProductDAO {
	
	ProductEntity saveProduct(ProductEntity product);
	
	ProductEntity loadProductById(Integer productId);
	
	ProductEntity updateProductById(Integer productId,Double new_UnitPrice);
	
	void deleteById(Integer productId);
	
	void testEntityStates();
	

}
