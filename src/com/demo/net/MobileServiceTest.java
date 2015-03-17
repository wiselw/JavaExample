package com.demo.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.Charset;

public class MobileServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString="     144   0 4 03201         1373737474712201301141340380641   ThisIsWPTestClien     603    9115        15006001 3505988037408194365425164    206266    ";
		aString = aString.replace("\\r", "\r");

		aString = aString.replace("\\n", "\n");
		sendRequest("10.2.6.87",443,aString);
	}
	public static void sendRequest(String ip,int port,String body){
		SocketAddress sa=new InetSocketAddress(ip,port) ;
		Socket socket=new Socket();;
		try {
			socket.connect(sa, 30000);
			OutputStream output = socket.getOutputStream();//
			PrintStream ps=new PrintStream(output);
			ps.println(body);
		    InputStream input = socket.getInputStream();
		    BufferedReader br =new BufferedReader(new InputStreamReader(input, Charset.forName("GBK")));
		    System.out.println(br.readLine()); ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
