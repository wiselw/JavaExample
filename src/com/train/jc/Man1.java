package com.train.jc;

import com.train.Persion;

public class Man1 extends Persion implements XB {

	public Man1(String name) {
		super(name);
		//xb="男";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setXb(String xb) {
		// TODO Auto-generated method stub
		//this.xb=xb;
	}

	@Override
	public String getXb() {
		// TODO Auto-generated method stub
		return xb;
	}

}
