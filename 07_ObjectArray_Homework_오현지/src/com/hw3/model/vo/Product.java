package com.hw3.model.vo;

import com.hw3.controller.ProductController;

public class Product {
	
	private int pid;
	private String pName;
	private int price;
	private double tax;
	
	public Product() {
		ProductController.count++;
	}
	
	public Product(int pid, String pName, int price, double tax) {
		
		this.pid = pid;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	
		ProductController.count++;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
