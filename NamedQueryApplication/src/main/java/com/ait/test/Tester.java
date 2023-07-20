package com.ait.test;

import java.util.List;

import com.ait.dao.EmpDAO;
import com.ait.dao.EmpDAOImpl;
import com.ait.entity.EmployeeEntity;

public class Tester {
	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAOImpl();
		/*
		List<EmployeeEntity> lst = dao.executeNamedQuery(20);
		lst.forEach(System.out::println);
		*/
	//	List lst1 = dao.executeNamedNativeQuery(2000);
	//	lst1.forEach(System.out::println);
		
		List<EmployeeEntity> lst = dao.executeCriteriaQuery();
		lst.forEach(System.out::println);
	}

}
