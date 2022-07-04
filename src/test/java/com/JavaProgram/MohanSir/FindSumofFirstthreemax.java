package com.JavaProgram.MohanSir;

public class FindSumofFirstthreemax {
	public static void main(String[] args) {
		int[] c= {10,25,89,75,145,658};
		for(int i=0;i<c.length-1;i++) {
			for(int j=0;j<c.length-1;j++) {
			if(c[j]<c[j+1]) {
				int temp=c[j+1];
				c[j+1]=c[j];
				c[j]=temp;
			}
			
			}
			
	 }
		int sum = 0;
		for(int i=0;i<c.length-3;i++) {
			sum=sum+c[i];
		}
		System.out.println(sum);
		
	}

}
