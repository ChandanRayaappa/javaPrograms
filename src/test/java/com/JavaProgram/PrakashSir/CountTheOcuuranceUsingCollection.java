 package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class CountTheOcuuranceUsingCollection {
	public static void main(String[] args) {
		String s="Chandan";
		//Step1: Createing object for Linkedhaset collection
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//step2:compare the given String with charater
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					//step3:increment the count
					count++;
				}
			}
			//step4:print the character along with the count
			System.out.println(ch+"="+count);
		}
	}

}
