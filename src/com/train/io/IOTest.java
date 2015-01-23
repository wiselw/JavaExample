package com.train.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class IOTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TestFile(".");
		TestFile("src\\com\\train\\io\\IOTest.java");
		fileInputStreamTest("src\\com\\train\\io\\IOTest.java");
		fileReaderTest("src\\com\\train\\io\\IOTest.java");
		fileOutputStreamTest("src\\com\\train\\io\\IOTest.java");
		fileWriterTest();
	}
	public static void TestFile(String path) throws IOException{
		File file=new File(path);
		System.out.println("文件或目录是否存在:" +  file.exists());
		System.out.println("是文件吗:" +  file.isFile());
		System.out.println("是目录吗:" +  file.isDirectory());
		System.out.println("名称:" +  file .getName());
		System.out.println("路径: " + file.getPath());
		System.out.println("绝对路径: " + file.getAbsolutePath());
		System.out.println("最后修改时间:" + file.lastModified());    
		System.out.println("文件大小:" + file.length()+ "字节");
		File newFile =new File(System.currentTimeMillis()+".txt");
		System.out.println("判断文件是否存在1:" + newFile.exists());
		newFile.createNewFile();
		System.out.println("判断文件是否存在2:" + newFile.exists());
		
	}
	
	public static void fileInputStreamTest(String path) throws IOException{
		//
		
		FileInputStream fis=new FileInputStream(path);
		byte[] bbuf=new byte[1024];
		int hasRead=0;
		while((hasRead=fis.read(bbuf))>0){
			System.out.println(new String(bbuf,0,hasRead));
		}
		fis.close();
	}
	public static void fileReaderTest(String path) {
		//程序使用了自动关闭资源的try语句来关闭文件输入流
		try (FileReader fr = new FileReader(path))
		{
			
			char[] cbuf=new char[32];
			int hasRead=0;
			while((hasRead=fr.read(cbuf))>0){
				System.out.println(new String(cbuf,0,hasRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void fileOutputStreamTest(String path){
		//
		try (FileInputStream fis=new FileInputStream(path);
			 FileOutputStream fos=new FileOutputStream(System.currentTimeMillis()+".txt"))
		{
			byte[] bbuf=new byte[32];
			int hasRead=0;
			while((hasRead=fis.read(bbuf))>0){
				fos.write(bbuf,0,hasRead);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void fileWriterTest(){
		try (FileWriter fw=new FileWriter(System.currentTimeMillis()+".txt"))
			{
				fw.write("锦瑟-李商隐\r\n");
				fw.write("锦瑟无端五十弦\r\n");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
}
