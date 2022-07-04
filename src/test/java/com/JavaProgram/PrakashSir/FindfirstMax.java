package com.JavaProgram.PrakashSir;

public class FindfirstMax {
	public static void main(String[] args) {
		int[] n= {20,87,98,157,845};
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
			
		}
		System.out.println(max); 
	}	
}
