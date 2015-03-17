package com.demo;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;

public class PortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(testPort1(4723));
	}
	public static boolean testPort(int port){
		//ServerSocket ss=null;
		try (ServerSocket ss=new ServerSocket(port);
			 DatagramSocket ds = new DatagramSocket(port)){
			//ss.setReuseAddress(true);
			//ds.setReuseAddress(true);
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
//			if (ss != null) {
//				try {
//					ss.close();
//				} catch (IOException ex) {
//					/* should not be thrown */
//				}
//			}
			return false;
		}
		finally{}
	}
	public static boolean testPort1(int port){
		ServerSocket ss=null;
		try {
			ss=new ServerSocket(port);
			//ss.setReuseAddress(true);
			//ds.setReuseAddress(true);
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
//			if (ss != null) {
//				try {
//					ss.close();
//				} catch (IOException ex) {
//					/* should not be thrown */
//				}
//			}

		}
		finally{
			if (ss != null) {
			try {
				ss.close();
			} catch (IOException ex) {
				/* should not be thrown */
			}
		}
		}
		return false;
	}

}
