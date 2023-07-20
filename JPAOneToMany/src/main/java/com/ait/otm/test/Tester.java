package com.ait.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.dao.CategoryDAOImpl;
import com.ait.otm.entities.CategoryEntity;
import com.ait.otm.entities.ProductEntity;

public class Tester {
	public static void main(String[] args) throws Exception {
		
		CategoryDAO dao =new CategoryDAOImpl();
		/*
		 * call saveCategory() method
		 */
		//create CategoryEntity instance
		/*
		CategoryEntity categoryEntity=new CategoryEntity();
		categoryEntity.setCategoryId(12101);
		categoryEntity.setCategoryName("ELECTRONICS");
		
		//create ProductEntity instance-1
		ProductEntity productEntity=new ProductEntity();
		productEntity.setProductId(220989);
		productEntity.setProductName("Happy1");
		
		File file=new File("E:\\images\\HD-wallpaper-be-happy-face-happy-smile-thumbnail.jpg");
		byte[] imageBytes = new byte[(int)file.length()];
		
		FileInputStream fis= new FileInputStream(file);
		fis.read(imageBytes);
		productEntity.setProductImage(imageBytes);
		
		//create ProductEntity instance-2
		ProductEntity productEntity1=new ProductEntity();
		productEntity1.setProductId(670832);
		productEntity1.setProductName("Happy2");
		
		File file1=new File("E:\\images\\images.jpg");
		byte[] imageBytes_happy = new byte[(int)file.length()];
		
		FileInputStream fis1= new FileInputStream(file1);
		fis1.read(imageBytes_happy);
		productEntity1.setProductImage(imageBytes_happy);
		
		//create ProductEntity instance-3
		ProductEntity productEntity2=new ProductEntity();
		productEntity2.setProductId(908997);
		productEntity2.setProductName("Happy3");
		
		File file2=new File("E:\\images\\images (1).jpg");
		byte[] imageBytes_happys = new byte[(int)file.length()];
		
		FileInputStream fis2= new FileInputStream(file2);
		fis2.read(imageBytes_happys);
		productEntity2.setProductImage(imageBytes_happys);
		
		//add ProductEntity instances to Collection.
		List<ProductEntity> lstOfProducts = Arrays.asList(productEntity,productEntity1,productEntity2);
		
		//set the collection to CategoryEntity instance
		categoryEntity.setLstOfProducts(lstOfProducts);
		
		dao.saveCategory(categoryEntity);
		*/
		/*
		 * call fetchCategory()
		 */
		/*
		CategoryEntity cEntity=dao.fetchCategory(12101);
		System.out.println("Category Name :" + cEntity.getCategoryName());
		List<ProductEntity> lst = cEntity.getLstOfProducts();
		//read the first element of the list
		ProductEntity pEntity = lst.get(0);
		System.out.println("Product Id: "+ pEntity.getProductId());
		System.out.println("Product Namer: "+pEntity.getProductName());
		byte[] bytesOfImage = pEntity.getProductImage();
		File f1 = new File("D:\\ImageFromDB\\from_DB.jpg");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(bytesOfImage);
		System.out.println("Please check the image at :"+ f1.getAbsolutePath());
		*/
		/*
		 * call removeCategory()
		 */
		//dao.removeCategory(12101);
		dao.testJoinQuery();
		
		}

}
