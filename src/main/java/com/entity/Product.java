package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer productId;
	private User user;
	private Integer productTypeId;
	private String productName;
	private Integer productScore;
	private String productDescription;
	private Short exchangeType;
	private String productImg;
	private Set exchangeItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(User user, Integer productTypeId, String productName, Integer productScore,
			String productDescription, Short exchangeType, String productImg, Set exchangeItems) {
		this.user = user;
		this.productTypeId = productTypeId;
		this.productName = productName;
		this.productScore = productScore;
		this.productDescription = productDescription;
		this.exchangeType = exchangeType;
		this.productImg = productImg;
		this.exchangeItems = exchangeItems;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductScore() {
		return this.productScore;
	}

	public void setProductScore(Integer productScore) {
		this.productScore = productScore;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Short getExchangeType() {
		return this.exchangeType;
	}

	public void setExchangeType(Short exchangeType) {
		this.exchangeType = exchangeType;
	}

	public String getProductImg() {
		return this.productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public Set getExchangeItems() {
		return this.exchangeItems;
	}

	public void setExchangeItems(Set exchangeItems) {
		this.exchangeItems = exchangeItems;
	}

}