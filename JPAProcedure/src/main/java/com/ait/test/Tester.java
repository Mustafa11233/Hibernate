package com.ait.test;

import java.util.Scanner;

import com.ait.dao.EmpDAO;
import com.ait.dao.EmpDAOImpl;

public class Tester {
	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAOImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter employee number: ");
		int empno = scan.nextInt();
		dao.executeProcedure(empno);
	}

}
