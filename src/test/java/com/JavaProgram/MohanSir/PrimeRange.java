package com.JavaProgram.MohanSir;

public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="5,4,5,3,8";
//		String[] a=s.split(",");
//		for(String b:a)
//		{
//		System.out.println(b);}
		
		int limit=100;
		for(int j=1;j<=limit;j++) {
		//int num=1;
		int c=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				c++;		
			}
		}
		if(c==2) {
			System.out.println(j+" prime number");
		}
		else
		{
			System.out.println(j+" not prime number");
		}

	}
	}

}
