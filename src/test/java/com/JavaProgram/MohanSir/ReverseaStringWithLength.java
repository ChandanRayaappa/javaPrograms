package com.JavaProgram.MohanSir;

public class ReverseaStringWithLength {
	public static void main(String[] args) {
		String s="Jai Hind jai karnataka";
		String[] arr = s.split(" ");
		//System.out.println(arr[0]);
		for(int i=0;i<arr.length;i++) {
		System.out.print(reverse(arr[i])+"{"+arr.length+"}");
		}

	}
	public static String reverse(String s) {
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		return rev;

	}

}
