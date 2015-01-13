package com.train.io;

import java.io.File;


public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFile(".");
		TestFile("src\\com\\train\\io\\IOTest.java");
	}
	public static void TestFile(String path){
		File file=new File(path);
		System.out.println("文件或目录是否存在:" +  file.exists());
		System.out.println("是文件吗:" +  file.isFile());
		System.out.println("是目录吗:" +  file.isDirectory());
		System.out.println("名称:" +  file .getName());
		System.out.println("路径: " + file.getPath());
		System.out.println("绝对路径: " + file.getAbsolutePath());
		System.out.println("最后修改时间:" + file.lastModified());    
		System.out.println("文件大小:" + file.length()+ "字节"); 
	}
	
	public static void readFile(String path){
		//
		
	}

}
