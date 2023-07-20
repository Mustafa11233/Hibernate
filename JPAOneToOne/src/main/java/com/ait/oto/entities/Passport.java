package com.ait.oto.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_passport")
public class Passport {
	@Id
	private Integer passportId;
	
	private String passportName;

	public Integer getPassportId() {
		return passportId; 
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportName() {
		return passportName;
	}

	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportName=" + passportName + "]";
	}

}
