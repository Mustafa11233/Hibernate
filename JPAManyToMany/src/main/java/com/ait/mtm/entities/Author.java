package com.ait.mtm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name  = "tbl_authors")
public class Author {
	@Id
	@Column(name ="author_id")
	private Integer authorId;
	
	@Column(name = "author_name")
	private String anuthorName;
	
	@ManyToMany(cascade = CascadeType.MERGE,mappedBy ="authors")	
	private List<Book> books;

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAnuthorName() {
		return anuthorName;
	}

	public void setAnuthorName(String anuthorName) {
		this.anuthorName = anuthorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", anuthorName=" + anuthorName + ", books=" + books + "]";
	}

}
