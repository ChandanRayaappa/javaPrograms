package com.JavaProgram.MohanSir;

public class ReverseAString {
public static void main(String[] args) {
	String a="chandan";
	String rev = " ";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}
	System.out.print(rev);
}
}
