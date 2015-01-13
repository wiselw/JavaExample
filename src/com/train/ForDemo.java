package com.train;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forTest();
	}
	public static void forTest(){
		int[] iarray= new int[10];
		//初始化
		for(int i=0;i<10;i++){
			iarray[i]=i;
		}
		//正常用法
		for(int j=0;j<iarray.length;j++){
			System.out.println(iarray[j]);
		}
		//foreach用法
		for(int i:iarray){
			System.out.println(i);
		}
		
	}

}
