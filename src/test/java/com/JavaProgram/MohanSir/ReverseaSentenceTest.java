package com.JavaProgram.MohanSir;

public class ReverseaSentenceTest {
	public static void main(String[] args) {
		String s="I LOVE MY COUNTRY";
		System.out.println(reverse(s));

	}
	public static String reverse(String s) {
		String rev=" ";
		for(int i=s.length()-1;i>0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		return rev;

	}





}
