package com.ait.oto.entities;

import com.ait.oto.dao.PersonDao;
import com.ait.oto.dao.PersonDaoImpl;

public class Tester {
	public static void main(String[] args) {
		
		PersonDao dao = new PersonDaoImpl();
		/*
		Person p =new Person();
		p.setPersonId(101);
		p.setPersonName("Raju");
		
		Person p1 =new Person();
		p1.setPersonId(102);
		p1.setPersonName("Rani");
		
		Passport pp=new Passport();
		pp.setPassportId(11);
		pp.setPassportName("Raju");
		
		Passport pp1=new Passport();
		pp1.setPassportId(22);
		pp1.setPassportName("Rani");
		
		p.setPassport(pp);
		p1.setPassport(pp1);
		
		dao.savePerson(p);
		dao.savePerson(p1);
		*/
		/*
		 * fetch Person data
		 */
		/*
		Person person = dao.fetchPerson(101);
		System.out.println(person.getPersonName());
		System.out.println(person.getPassport());
		*/
		/*
		 * remove person data
		 */
		dao.removePerson(101);
		
		
	}

}
