 package com.JavaProgram.PrakashSir;

public class FindSecondmin {
	public static void main(String[] args) {
		int[] num= {62,4,7,6};
		int fmin=num[0];
		int smin=num[1];
		for(int i=0;i<num.length-1;i++) {
			if(fmin>num[i+1]) { 
				smin=fmin; 
				fmin=num[i+1];
			}
			else if(smin>num[i+1]) {
				if(smin!=fmin) {
					smin=num[i+1];
				}
			}
		}
		System.out.print(fmin+" "+smin);
	}

}
