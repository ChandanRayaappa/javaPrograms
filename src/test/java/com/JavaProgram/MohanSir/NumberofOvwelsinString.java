package com.JavaProgram.MohanSir;

public class NumberofOvwelsinString {
	public static void main(String[] args) {
		String s="Naie";
		String vowel="aeiou";
		String lower = s.toLowerCase();
		int c=0;
		for(int i=0;i<lower.length();i++) {
			char ch = lower.charAt(i);
			for(int j=0;j<vowel.length();j++)
			{
				char ch1 = vowel.charAt(j);
				if(ch==ch1)
					c++;
			}
		}
		System.out.println(c);
	}

}
