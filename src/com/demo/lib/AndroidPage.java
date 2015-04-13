package com.demo.lib;

public class AndroidPage extends Page {

	@Override
	public void setCity(String city) {
		// TODO Auto-generated method stub
		System.out.println("Android:"+city);
	}

	@Override
	public void setDate(String date) {
		// TODO Auto-generated method stub
		System.out.println("Android:"+date);
	}

	@Override
	public void clickSearch() {
		// TODO Auto-generated method stub
		System.out.println("IOS:Android");
	}

}
