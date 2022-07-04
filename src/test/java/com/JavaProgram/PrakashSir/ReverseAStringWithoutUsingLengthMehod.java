 package com.JavaProgram.PrakashSir;

public class ReverseAStringWithoutUsingLengthMehod {
	public static void main(String[] args) {
		String s="chandan";
		String rev=" ";
		char[] ch = s.toCharArray();		
		for(char data:ch) {
			rev=data+rev;
			
		}
		System.out.println(rev);
		}

}
