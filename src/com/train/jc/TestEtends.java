package com.train.jc;

public class TestEtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEtends aEtends=new TestEtends();
		SubClass sc=aEtends.new SubClass();
		SubClass sc1=aEtends.new SubClass(2);
		
	}
	public class Base{
		public Base(){
			System.out.println("Base的构造函数");
		}
		public Base(int a){
			System.out.println("Base的构造函数:"+a);
		}
	}
	public class SubClass extends Base {
		public SubClass(){
			System.out.println("SubClass的构造函数");
		}
		public SubClass(int a){
			super(a);
			System.out.println("SubClass的构造函数 a:"+a);
		}
	}

}
