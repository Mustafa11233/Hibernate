package com.ait.oto.dao;

import com.ait.oto.entities.Person;

public interface PersonDao {
	
	void savePerson(Person person);
	
	Person fetchPerson(Integer personId);
	
	void removePerson(Integer personId);
	
	

}
