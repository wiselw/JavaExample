package com.ms;

public class Money {
	public static void main(String[] args){
		System.out.println(count(0,1,0));
	}
	public static long count(int x,int y,int z){
		long num=1;
		if(x>0){
			num+=count(x-1,y+2,z);
		}
		if(y>0){
			num+=count(0, y-1, z+2);
		}
		num+=z;
		return num;
	}

}
