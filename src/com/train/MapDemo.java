package com.train;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class MapDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//propertiesTest();
		//hashMapTest();
		configTest();
	}
	public static void propertiesTest() throws IOException{
		Properties properties=new Properties();
		properties.load(MapDemo.class.getResourceAsStream("config.properties"));
		System.out.println(properties.get("env"));
		//properties.put(null, null);
		//System.out.println(properties.get(null));
	}
	public static void hashMapTest(){
		/**
		 *HashMap和Hashtable都是Map接口的典型实现类，它们的区别如下：
		 *Hashtable是一个线程安全的Map实现，但HashMap是线程不安全的实现，所以HashMap比Hashtable的性能高一点；
		 *但如果有多条线程访问同一个Map对象时，使用Hashtable实现类会更好。
         *Hashtable不允许使用null作为key和value，如果试图把null值放进Hashtable中，
         *将会引发NullPointerException异常；但HashMap可以使用null作为key或value 
		 */
		Map map=new HashMap();
		map.put("env", "fws");
		map.put("env", "aaaaa");
		map.put("dep", "hotel");
		
		System.out.println(map.size());
		System.out.println(map.get("env"));
	}
	
	public static void configTest() throws IOException{
		Properties properties=new Properties();
		properties.load(MapDemo.class.getResourceAsStream("config.properties"));
		System.out.println(properties);
		Iterator<Object> it0= properties.keySet().iterator();
		while(it0.hasNext()){
			Object tmp=it0.next();
			if(tmp.toString().startsWith("log4j")){
				properties.put(tmp, properties.get(tmp)+"new");
			}
			
		}
//		Iterator<Entry<Object, Object>> it1 =properties.entrySet().iterator();
//		while(it1.hasNext()){
//			Entry<Object, Object> tmp=it1.next();
//			properties.put(tmp.getKey(), tmp.getValue()+"new");
//		}
//		for(Entry<Object, Object> tmpEntry: properties.entrySet()){
//			//
//			properties.put(tmpEntry.getKey(), tmpEntry.getValue()+"new");
//		}
		
		System.out.println("new:"+properties);
		Map<Object, Object> conf=new HashMap<Object, Object>();
		conf.putAll(properties);
		System.out.println(conf);
	}
}
