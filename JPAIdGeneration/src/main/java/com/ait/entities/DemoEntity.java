package com.ait.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_demo")
public class DemoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "idgen")
	@SequenceGenerator(name="idgen", sequenceName = "my_own_sequence",allocationSize = 1)
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
