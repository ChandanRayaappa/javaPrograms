package com.JavaProgram.PrakashSir;

public class PushThe10End {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};//30 40 50 10 20

		for(int i=0;i<3;i++) {
			int temp=a[0];
			for(int j=1;j<a.length;j++) {
				a[j-1]=a[j];
				
			}
			a[a.length-1]=temp;
			
		}
		for(int data:a)
		{
			System.out.println(data);
		}
		}

}
