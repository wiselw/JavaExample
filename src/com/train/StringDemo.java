package com.train;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo();
		stringCompare();
	}
	public static void StringDemo(){
		//使用字符串常量直接创建、初始化
		String s1="Hello world!";
		char[] arrayChar=new char[]{'a','b','c','d','e','f'};
		//使用构造方法创建并初始化
		String s2=new String(arrayChar);
		String s3=new String(arrayChar,2,3);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		//public String subString(int beginIndex,int endIndex);
		//返回的字符串是从beginIndex开始到endIndex-1的串
		String tmp=s1.substring(6, 11);
		System.out.println("tmp："+tmp);
		String s5="aaa,bbb,ccc,ddd";
		char[] achar=s5.toCharArray();
		String[] aStrings=s5.split(",");
		System.out.println("achar[0]："+achar[0]);
		System.out.println("aStrings[0]："+aStrings[0]);
		
		
		
		 
	}
    public static void   stringCompare(){
    	//
    	String s1="Hello world!";
    	String s2="Hello world!";
    	System.out.println("s1==s2："+(s1==s2));
		System.out.println("s1 equals s2："+(s1.equals(s2)));
		String s3=new String("Java");
		String s4=new String("Java");
		System.out.println("s3==s4："+(s3==s2));
		//比较字符串的值是否相等，使用equals
		System.out.println("s3 equals s4："+(s3.equals(s4)));
    } 
}
