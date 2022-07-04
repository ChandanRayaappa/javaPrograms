
package com.JavaProgram.PrakashSir;

public class FinndSecondMaxWithoutusingBubbleSort {
	public static void main(String[] args) {
		int[] n= {10,20,78,54,69,874};
		//String num = n.toString();
		int fmax=n[0];
		int smax=n[1];
		for(int i=0;i<n.length-1;i++) {
			if(fmax<n[i+1]) {
				smax=fmax;
				fmax=n[i+1];
			}
			else if(smax<n[i+1]) {
				if(fmax!=smax) {
					smax=n[i+1];
				}

			}
		}
		System.out.println(smax);
	}

}
