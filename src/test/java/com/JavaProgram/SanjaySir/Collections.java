package com.JavaProgram.SanjaySir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Collections {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("c");
		list.add(1);

		System.out.println(list);
		ArrayList<Object> list1=new ArrayList<Object>();
		list1.add("ck");
		list1.add("a");
		list1.add("b");
		list1.add("8");
		list1.add(1);
		list.retainAll(list1);
		System.out.println(list);
		LinkedList<Object> linklist=new LinkedList<Object>();
		linklist.add("ck");
		linklist.addFirst("chandankuamr");
		linklist.addLast("kumar");
		System.out.println(linklist);
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(10);
		set.add("ab");
		set.add(null);
		System.out.println(set);
		Iterator<Object> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
