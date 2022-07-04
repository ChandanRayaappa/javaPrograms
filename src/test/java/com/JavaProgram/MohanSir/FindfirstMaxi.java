package com.JavaProgram.MohanSir;

public class FindfirstMaxi {
	public static void main(String[] args) {
		int[] a= {10,102,52,74,54,85,14};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) 
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		for(int i=0;i<2;i++)
		{
			System.out.println(a[i]);
		}	
	}
}