package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.StudentDAOImpl;
import com.ait.entity.Student;

public class Tester {
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();

		/*
		 * creating Student object
		 */
/*
		Student student = new Student();
		student.setSid(110);
		student.setSname("Raja");
		student.setGender("Male");
		student.setMarks(600);
		
		dao.saveStudent(student);
*/
		
		/*

		Student stud = dao.loadStudent(112);
		System.out.println(stud);
*/
//		Student s=dao.updateStudent(110,1100);
//		System.out.println(s);
		
		dao.deleteStudent(110);
		
	}

}
