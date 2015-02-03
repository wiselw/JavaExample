package com.train.jc;

public class TestEtends {

	public static void main(String[] args) {
		//构造函数调用顺序演示
		SubClass sc=new SubClass();
		//SubClass sc1=new SubClass(2);
		Base sc2=new SubClass();//多态
		Base sc3=new Base();//多态
		sc2.test();//调用子类test方法
		sc3.test();
		sc.newMethod();
	}
}
 class Base{
	public Base(){
		System.out.println("Base的构造函数");
	}
	public Base(int a){
		System.out.println("Base的构造函数:"+a);
	}
	public void test(){
		System.out.println("我是父类test()方法");
	}
}
 class SubClass extends Base {
	public SubClass(){
		System.out.println("SubClass的构造函数");
	}
	public SubClass(int a){
		super();
		System.out.println("SubClass的构造函数 a:"+a);
	}
	public void test(){
		System.out.println("我是子类类test()方法");
	}
	public void newMethod(){
		System.out.println("SubClass新方法");
	}
}
