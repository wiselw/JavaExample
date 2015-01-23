package com.train.exercises;

public class Wanshu {
/**
 * 一个数，如果恰好等于他的因子之和，那么就称它为“完数”，如6=1+2+3.编写程序找出10000以内所有完数
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wanShu(10000);
	}
	public static void wanShu(int m){
		int s;
		for(int i=1;i<=m;i++){
			s=0;
			for (int j = 1; j < i; j++) {
				if(i%j==0){
					s=s+j;
				}	
			}
			if(s==i){
				for (int j = 1; j < i; j++) {
					if(i%j==0){
						System.out.print(j+"  ");
					}	
				}
				System.out.println("="+i);
			}
		}
		System.out.println("end");
	}

}
