package com.train;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		switchTest(2);
	}
	
	public static void switchTest(int dayOfWeek){
		switch (dayOfWeek) {
		case 1:
			System.out.println("星期一");
			//break;
		case 2:
			System.out.println("星期二");
			//break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		default:
			System.out.println("周末");
			break;
		}
		
	}

}
