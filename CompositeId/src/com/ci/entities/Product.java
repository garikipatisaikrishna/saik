package com.ci.entities;

import java.util.Date;

public class Product {
	private int productid;
	private String batchcode;
	private String productname;
	private String manifacture;
	private Date manifacturedate;
	private float amount;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getBatchcode() {
		return batchcode;
	}
	public void setBatchcode(String batchcode) {
		this.batchcode = batchcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getManifacture() {
		return manifacture;
	}
	public void setManifacture(String manifacture) {
		this.manifacture = manifacture;
	}
	public Date getManifacturedate() {
		return manifacturedate;
	}
	public void setManifacturedate(Date manifacturedate) {
		this.manifacturedate = manifacturedate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	

}
