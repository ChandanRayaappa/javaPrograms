package com.JavaProgram.PrakashSir;

public class pushtheZeroToEnd {
	public static void main(String[] args) {
		int[] num= {0,2,0,1,4,5,0,0,5,77};

		for(int i=0;i<num.length;i++) {

			if(num[i]!=0) {
				int rem=num[i];
				System.out.println(rem);
			}

		}
		for(int i=0;i<num.length;i++) {
			if(num[i]==0) {
			}
		}

	}
}
