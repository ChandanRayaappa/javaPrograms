package com.JavaProgram.MohanSir;

import java.lang.reflect.Array;

public class NumberPallindromefromarray {
	public static void main(String[] args) {
		int[] crr= {62,89,717,121,161,999};
	
		
		for(int i=0;i<crr.length;i++) {
		int c = Array.getInt(crr, i);
	   // System.out.println(c);
		int k = c;
	    int rev = 0;
	    while(c!=0) {
	    	int num = c%10;
	    	rev=rev*10+num;
	    	c=c/10;
	    }
	    if(rev==k) {
	    System.out.println(rev);
	    }
	    
	    
		}

		
	}
	
}
