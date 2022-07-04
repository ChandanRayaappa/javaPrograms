package com.JavaProgram.MohanSir;

public class Palindrome { 
	public static void main(String[] args) {
		
	
	String s="AKKA";
	String rev = reverse(s);
	
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("yes its plaindrome");
	}
	
	
	}	
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			}
		return rev;
		
	
}
}