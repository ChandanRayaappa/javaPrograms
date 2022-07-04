package com.Chandan.Practice;

public class Reverse {
	public static void main(String[] args) {
		String s="i am from hassan";
		String[] arr = s.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);	
			System.out.print(" ");
		}
	}
	
	
	
	
}
