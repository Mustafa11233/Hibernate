package com.ait.mto.test;

import com.ait.mto.dao.LoanDAO;
import com.ait.mto.dao.LoanDAOImpl;
import com.ait.mto.entities.Customer;
import com.ait.mto.entities.Loan;

public class Tester {
	public static void main(String[] args) {
		
		LoanDAO dao = new LoanDAOImpl();
		/*
		 * invoke saveLoan()
		 */
		/*
		Loan ploan = new Loan();
		ploan.setLoanId(1010);
		ploan.setLoanType("Personal Loan");
		ploan.setAmount(500000.00);
		
		Loan vloan = new Loan();
		vloan.setLoanId(1011);
		vloan.setLoanType("Vechicle Loan");
		vloan.setAmount(210000.00);
		
		Loan hloan = new Loan();
		hloan.setLoanId(1012);
		hloan.setLoanType("Home Loan");
		hloan.setAmount(990000.00);
		
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("A");
		
		ploan.setCustomer(customer);
		vloan.setCustomer(customer);
		hloan.setCustomer(customer);
		
		dao.saveLoan(ploan);
		dao.saveLoan(vloan);
		dao.saveLoan(hloan);
		*/
		/*
		 * call fetchLoanDetailsById()
		 */
		/*
		Loan loan = dao.fetchLoanDetailsById(1010);
		System.out.println(loan);
		Customer c = loan.getCustomer();
		System.out.println(c);
		*/
		/*
		 * call removeLoan()
		 */
		dao.removeLoan(1010);  
		
	}
}
