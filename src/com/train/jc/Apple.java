package com.train.jc;

public class Apple extends Fruit {
	public static void main(String[] args){
		Apple apple=new Apple();
		apple.weight=60;
		apple.info();
		apple.info("qing");
	}
	public void info(){
		System.out.println("我是一个苹果！ 重"+weight+"g!");
	}
	public void info(String a){
		System.out.println("我是一个苹"+a+"果！ 重"+weight+"g!");
	}
	public void info(String a,String b){
		System.out.println("我是一个苹"+a+"果！ 重"+weight+"g!");
	}

}
