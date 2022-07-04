package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class SwapTheStringWithoutUsingTheThirdVariable {
	public static void main(String[] args) {
		String str="ABC";
		String str1="BC";
	String str2=str+str1;
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<str2.length();i++) {
		set.add(str2.charAt(i));
		
	}
	for(Character data:set)
	{
		int count=0;
		for(int i=0;i<str2.length();i++) {
			if(data==str2.charAt(i)) {
           count++;
		}
			
	}
		if(count==1) {
			System.out.println(data);
			}
		}
		
	}

	}
