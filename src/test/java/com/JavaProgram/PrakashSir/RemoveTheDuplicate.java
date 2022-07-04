 package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class RemoveTheDuplicate {
	public static void main(String[] args) {
		String s="chandan";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character data:set) {
			System.out.print(data);
		}

	}
}
