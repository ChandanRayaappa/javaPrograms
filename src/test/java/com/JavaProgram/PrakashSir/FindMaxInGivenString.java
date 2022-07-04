package com.JavaProgram.PrakashSir;

public class FindMaxInGivenString {
	public static void main(String[] args) {
		String[] s= {"sri","HeeraAnju","Kiara","ck","venkygovinda"};
		String max=s[0];
		for(int i=1;i<s.length;i++) {
			if(max.length()<s[i].length()) {
				max=s[i];
			}
		}
  System.out.println(max);
	}

	 

}
