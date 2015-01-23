package com.train;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInit();
	}
	public static void ArrayInit(){
		String[] arrayStr;//定义一个String数组类型，变量名为arrayStr
		//使用静态初始化，初始化数组时，只指定数组元素的初始值，不指定数组元素的长度
		arrayStr=new String[]{"大熊","文太"};
		//动态初始化：只指定数组的长度，由系统为每个数组元素指定初始值
		//数组定义和初始化同时完成，使用动态初始化语法
		int[] arrayCounts=new int[5];
		/**
		 * 访问数组元素是通过在数组引用变量后紧跟一个方括号（[ ]），方括号里是数组元素的索引值
		 * Java语言的数组索引是从0开始的，也就是说，第一个数组元素的索引值为0，最后一个数组元素的索引为数组长度减1
		 * 如果访问数组元素进指定的索引小于0，或者大于等于数组的长度，编译程序不会出现任何错误，
		 * 但运行时出现异常：java.lang.ArrayIndexOutOfBoundsException:2（数组索引越界异常），
		 * 在这个异常提示信息后有一个int 整数，这个整数就是程序员试图访问的数组索引
		 * 所有数组都提供了一个length属性，通过这个属性可以访问到数组的长度，一旦获得了数组的长度后，
		 * 就可以通过循环来遍历该数组的每个数组元素
		 */
		arrayStr[0]="蛤蟆吉";
		System.out.println(arrayStr[0]);
		System.out.println(arrayStr[1]);
		System.out.println(arrayStr.length);
	}

}
