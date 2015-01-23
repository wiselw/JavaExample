package com.train;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collectionTest();
		//setTest();
		testtoString();
	}
	public static void collectionTest() {
		Collection c= new ArrayList();
		c.add("a");//添加元素
		c.add(1);//添加同类型的元素
		System.out.println("c的元素个数："+c.size());
		c.remove(1);//删除元素
		System.out.println("c中是否包含\"方正\"："+c.contains("方正"));
		c.add("石头");//添加元素
		System.out.println("c中元素："+c);
		//迭代器
		Iterator it =c.iterator();
		while (it.hasNext()) {
			System.out.println((String)it.next());
		}
		
	}
	public static void setTest(){
		/**
		 * 不能保证元素的排列顺序，顺序可能与元素的添加顺序不同，元素的顺序可能变化。
		 * HashSet不是同步的，如果多个线程同时访问一个HashSet，如果有2条或者2条以上线程同时修改了HashSet集合时，必须通过代码来保证其同步。
		 * 集合元素值可以是null
		 */
		Set set=new HashSet();
		set.add(1);
		set.add(3);
		set.add(2);
		Iterator it =set.iterator();
		while (it.hasNext()) {
			System.out.println((int)it.next());
			
		}
		/**
		 * LinkedHashSet集合也是根据元素hashCode值来决定元素存储位置，但它同时使用链表维护元素的次序，这样使得元素看起来是以插入的顺序保存的。
		 * 也就是说，当遍历LinkedHashSet集合里元素时，HashSet将会按元素的添加顺序来访问集合里的元素。
		 * LinkedHashSet需要维护元素的插入顺序，因此性能略低于HashSet的性能，但在迭代访问Set里的全部元素时将有很好的性能，因为它以链表来维护内部顺序
		 */
		Set linkSet=new LinkedHashSet();
		linkSet.add(4);
		linkSet.add(6);
		linkSet.add(5);
		Iterator lit =linkSet.iterator();
		while (lit.hasNext()) {
			System.out.println((int)lit.next());
			
		}
		
	}
    public static void testtoString(){
    	ArrayList<ArrayList> all = new ArrayList<ArrayList>();
    	ArrayList<String> resultList1 = new ArrayList<String>();
    	resultList1.add("aaaaa");
    	resultList1.add("bbbbb");
    	resultList1.add("ccccc");
    	all.add(all);
    	System.out.println("all中元素："+all);
    	System.out.println("resultList1中元素："+resultList1);
    	//resultList1.clear();
    }
}
