package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class numofWordOcuranc {
	public static void main(String[] args) {
		String s="Hello am chandan";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String data:set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(data.equals(str[i])) {
					count++; 
				}
			}
			System.out.println(data+"="+count);
		}
	}

} 
