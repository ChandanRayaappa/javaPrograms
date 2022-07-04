package com.JavaProgram.PrakashSir;

public class BubleSortDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] n= {10,84,54,74,87};
	for(int i=0;i<n.length;i++) {
		for(int j=i+1;j<n.length;j++) {
			if(n[i]<n[j]) {
				int temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			} 
		}
	}
	for(int data:n) {
		System.out.println(data);
	}
	}

}
