package com.JavaProgram.MohanSir;

public class BubbleSort {
public static void main(String[] args) {
	int[] c= {101,15,87,741,18};
	
	for(int j=1;j<c.length;j++) {
		 
	for(int i=0;i<c.length-1;i++) {
		
		if(c[i]<c[i+1]) {
			int temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
		}
	}
	
	}
	
	for(int data:c)
	{
	System.out.print(data+" ");
	
	}
	
}
}
