package com.train;

public class ReturnContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest();
		//ContinueTest();
		//BreakTest();

	}
	public static void ReturnTest(){
		for (int i = 0; i < 10; i++) {
			if(i==5){
				return;
			}
			else{
				System.out.println(i);
			}
		}
		System.out.println("ret");
	}
	public static void ContinueTest(){
		for (int i = 0; i < 10; i++) {
			if(i==5){
				continue;
			}
			else{
				System.out.println(i);
			}
			System.out.println("continue:"+i);
		}
	}
	public static void BreakTest(){
		for (int i = 0; i < 10; i++) {
			if(i==5){
				break;
			}
			else{
				System.out.println(i);
			}
			System.out.println("break:"+i);
		}
		System.out.println("break");
	}

}
