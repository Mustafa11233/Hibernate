package com.ait.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

public class EmpDAOImpl implements EmpDAO {
	
	private EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("test");

	@Override
	public void executeProcedure(int empno) {
		EntityManager em = factory.createEntityManager();
		StoredProcedureQuery query = em.createStoredProcedureQuery("pro1");
		query.setParameter("ENO",empno);
		EntityTransaction tx = em.getTransaction();	
		tx.begin();
		query.execute();
		
	 String	s1=(String)query.getOutputParameterValue("NAME");
	 double d = (Double)query.getOutputParameterValue("EXPERIENCE");
	 System.out.println("Name::"+s1);
	 System.out.println("Experience::"+d);
	 
	 tx.commit();
	 em.close();
	 factory.close();
	}

}
