package com.train;

import java.util.Date;

public class Order {
	private String orderId;
	private float price;
	private Date date;
	private int status;
	public Order(String orderId,float price) {
		this.orderId=orderId;
		this.price=price;
		date=new Date();//为什么不用this	
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public float getPrice() {
		return price;
	}
	public Date getDate() {
		return date;
	}

}
