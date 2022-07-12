
package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class RemoveDupilcateFromGivenString {
	public static void main(String[] args) {
		String s="hello am chandan chandan kumar";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String data:set) {
			System.out.print(data+" ");
		}
	}
}
