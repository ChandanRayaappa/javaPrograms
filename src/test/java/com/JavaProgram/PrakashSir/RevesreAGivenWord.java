package com.JavaProgram.PrakashSir;

public class RevesreAGivenWord {
	public static void main(String[] args) {
		String s="I am from hassan";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
	
	

}
