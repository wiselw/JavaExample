package com.demo.lib;

public class PageObject {
	public static  Page page;
	public static Page createPage(String a){
		if (a.equals("IOS")){
			return new IOSPage();
		}
		else if (a.equals("Android")) {
			return new AndroidPage();
		}
		else {
			return null;
		}
	}

}
