package com.infosys.oms.entity;

import java.io.Serializable;

public class ProductsOrderedId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String buyerId;
	String prodId;
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
}
