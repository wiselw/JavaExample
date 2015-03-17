package com.demo;

import java.io.File;

public class USERHomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inputtemp = new byte[''];
		System.out.println(inputtemp.length);
       System.out.println(System.getProperty("user.home"));
       System.out.println(System.getProperty("user.home")+File.separator+"al");
       System.out.println("3".compareTo("2")>0);
       System.out.println("2015-03-09 05:29:19 774".compareTo("2015-03-09 05:29:19 790")>0);
	}

}
