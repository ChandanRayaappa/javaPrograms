package com.JavaProgram.PrakashSir;

public class PermutationAndCobiunation {
	public static void main(String[] args) {
		String ch = null ;
		String [] x= {"A","B","C"};
	String [] y= {"W","X","Y","Z"};
		for(int i=0;i<x.length;i++) {
			String s=x[i];
			//System.out.println(s);
			for(int j=0;j<y.length;j++) {
				if(!(s.equals(y[j]))) {
				 ch = s+y[j];
				}
				System.out.print(ch+",");
			}
			
		}
		
	}

}
