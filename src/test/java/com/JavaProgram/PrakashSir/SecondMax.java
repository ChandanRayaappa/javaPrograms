 package com.JavaProgram.PrakashSir;

public class SecondMax {

	public static void main(String[] args) {
		int[] n= {1,2,50,54,5,64,78};
		int fmax=n[0];
		int smax=n[0];
		for(int i=0;i<n.length;i++) {
			if(fmax<n[i]) {
				smax=fmax;
				fmax=n[i];
			}
			else if(smax<n[i]) {
				smax=n[i];
			}
		}
	System.out.println(fmax);
	System.out.println(smax);
	}
	

}
