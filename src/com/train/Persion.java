package com.train;

public class Persion {
	private String name;//属性
	private int age;
	private String address;
	private String email;
	//构造器
	public Persion(String name){
		this.name=name;
	}
	//方法
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
