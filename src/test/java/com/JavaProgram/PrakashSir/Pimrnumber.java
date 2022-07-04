package com.JavaProgram.PrakashSir;

public class Pimrnumber {
	public static void main(String[] args) {
		int[] a= {10,21,54,87,64,1,2,3,4,5,6};
				
				for(int i=0;i<a.length;i++) {
					int num=a[i];
					int j=2;
					while(num>=j) {
						if(num%j==0) {
							break;
						}
						else {
							j++;
						}
						if(num==j) {
							System.out.println(num);
						}
					}
				}
				
	}

}
