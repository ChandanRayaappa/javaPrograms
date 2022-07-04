
package com.JavaProgram.PrakashSir;

public class SortTHeGivenNumberInAcendingOrder {
	public static void main(String[] args) {
	int[]	n={10,87,64,75};
	for(int j=0;j<n.length;j++) {
	 for(int i=j+1;i<n.length;i++)
	 {
		 if(n[j]>n[i]) {
			int temp=n[i];
			 n[i]=n[j];
			 n[j]=temp;
			 }	 
	 }
	System.out.println(n[j]);

	}
		 
	
	
	
	}
}
  