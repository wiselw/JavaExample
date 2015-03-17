package com.train.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import com.train.MapDemo;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readerToWriterDemo("src/com/train/exercises/IO.txt","src/com/train/exercises/IO.properties");
		readProperties("src/com/train/exercises/IO.properties");
	}
	
	public static void readerToWriterDemo(String  oldPath,String newPath){
		//
		try(BufferedReader br=
		new BufferedReader(new FileReader(oldPath));
			BufferedWriter bw  =
		new BufferedWriter(new FileWriter(newPath))){
			String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = br.readLine()) != null) {
                // 显示行号
            	
                System.out.println("line " + line + ": " + tempString);
                String[] tmp=tempString.split(":");
                if(tmp.length==2){
                	bw.append(tmp[0]+"="+tmp[1]);
                	bw.newLine();
                }
                line++;
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void readProperties(String path){
			Properties pro =new Properties();
			BufferedReader bf;
			try (InputStream in=new FileInputStream(path)){
				bf = new BufferedReader(new InputStreamReader(in,"UTF-8"));
				pro.load(bf);
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(pro);
	}

}
