package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class PrintTheWordsalongWiththeIndex {
	public static void main(String[] args) {
		String s= "Welcome to tyss welcome to banglore";
		
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String data:set) {
			
			for(int i=0;i<str.length;i++) {
				if(data.equals(str[i])) {
					System.out.println(data+"="+(i+1));
				}
			}
			
		}
	}
		

}
