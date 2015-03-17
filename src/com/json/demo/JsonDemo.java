package com.json.demo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createJSON();
		objectToJSON();
	}
	public static void objectToJSON(){
		Suite suite1=new Suite();
		suite1.setSuiteName("aaaa1");
		suite1.setSuccess(9);
		suite1.setFail(0);
		suite1.setSkip(0);
		suite1.setTotal(9);
		Suite suite2=new Suite();
		suite2.setSuiteName("aaaa2");
		suite2.setSuccess(0);
		suite2.setFail(0);
		suite2.setSkip(9);
		suite2.setTotal(9);
		Suite suite3=new Suite();
		suite3.setSuiteName("aaaa3");
		suite3.setSuccess(0);
		suite3.setFail(9);
		suite3.setSkip(0);
		suite3.setTotal(9);
		Project p=new Project();
		List<Suite> suites=new ArrayList<Suite>();
		suites.add(suite1);
		suites.add(suite2);
		suites.add(suite3);
		p.setSuites(suites);
		p.setSuccess(9);
		p.setFail(9);
		p.setSkip(9);
		p.setTotal(27);
		JSONObject jObject= new JSONObject(p);
		System.out.println(jObject);
		
	}
	public static void createJSON(){
		//
		JSONObject jo=new JSONObject();
		jo.put("success", 9);
		jo.put("fail", 0);
		jo.put("skip", 0);
		jo.put("total", 9);
		JSONArray ja=new JSONArray();
		JSONObject suite1=new JSONObject();
		suite1.put("suiteName", "orgTest");
		suite1.put("success", 5);
		suite1.put("fail", 0);
		suite1.put("skip", 0);
		suite1.put("total", 5);
		JSONObject suite2=new JSONObject();
		suite2.put("suiteName", "orgTest");
		suite2.put("success", 4);
		suite2.put("fail", 0);
		suite2.put("skip", 0);
		suite2.put("total", 5);
		ja.put(suite1);
		ja.put(suite2);
		jo.put("suites", ja);
		System.out.println(jo);
		
	}
	 
}
//class Project{
//	
//}
//  class Suite{
//	
//	
//}

