package com.ait.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tbl_product")
public class ProductEntity {
	
	@Id
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name="product_name")
	private String productName;
	
	private Integer quantity;
	
	@Column(name="unit_price")
	private Double unitPrice;
	
	@Column(name="CREATED_ON")
	@CreationTimestamp
	private LocalDate createOn;
	
	@Column(name="LASTUPDATED_ON")
	@UpdateTimestamp
	private LocalDate updateOn;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDate getCreateOn() {
		return createOn;
	}

	public void setCreateOn(LocalDate createOn) {
		this.createOn = createOn;
	}

	public LocalDate getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDate updateOn) {
		this.updateOn = updateOn;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", createOn=" + createOn + ", updateOn=" + updateOn + "]";
	}
	 
}
