package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class Repeat {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("u1,u2");
		set.add("u3,u4");
		set.add("u1,u5");
		String s = "u2,u1";
		set.add(s);
		String s1 = "u4,u3";
		set.add(s1);
		for( String data:set) {
			if(!(data.equals(s1) || data.equals(s))){
			
		System.out.println(data);
			}
		}
	}

}
