package com.demo.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("172.16.2.110",30000);
		new Thread(new ClientThread(socket)).start();
		PrintStream pStream=new PrintStream(socket.getOutputStream());
		String line=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while((line=br.readLine())!=null){
			pStream.println(line);
		}
	}

}
