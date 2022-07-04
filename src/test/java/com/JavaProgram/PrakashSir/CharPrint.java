package com.JavaProgram.PrakashSir;

public class CharPrint {
	public static void main(String[] args) {
	String s="a1#b2@c3$";//abc 123 #@$
	String alpha="";
	String num="";
	String spe="";
	for(int i=0;i<s.length();i++) {
	char ch = s.charAt(i);
	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ) {
		alpha=alpha+ch;
		System.out.print(ch);
	}
	else if(ch>='0' && ch<='9') {
		num=num+ch;
		}
	else {
		spe=spe+ch;
	}
	}
	System.out.println(alpha+ " "+num+" "+spe);
	
	}

}
