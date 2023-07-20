package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.StudentDAOImpl;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public class Tester {
	public static void main(String[] args) {
		StudentDAO dao=new StudentDAOImpl();
		
		/*
		 * save a student entity
		 */
		/*
		StudentCompositeKey key=new StudentCompositeKey();
		key.setRollNumber(101);
		key.setSection("B");
		
		StudentEntity entity =new StudentEntity();
		entity.setCompositeKey(key);
		entity.setStudentName("SANJAY");
		entity.setMarks(800);
		
		dao.saveStudent(entity);
		*/
		/*
		 * fetch a student entity
		 */
		StudentCompositeKey key=new StudentCompositeKey();
		key.setRollNumber(101);
		key.setSection("A");
		
		StudentEntity fetchStudent = dao.fetchStudent(key);
		System.out.println("name::"+fetchStudent.getStudentName());
		System.out.println("Marks::"+fetchStudent.getMarks());
	}

}
