package com.JavaProgram.PrakashSir;

public class CheckGivenNumberIsaPrimeNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3,7,5,6};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int j=2;

			while(n>=j) 
			{
				if(n%j==0) 
				{
					break;
				}
				else
				{
					j++;
				}
			}
				if(n==j) 
				{
					System.out.println(a[i]);
				}
			}
		}			
	
} 
