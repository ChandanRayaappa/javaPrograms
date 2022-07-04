 package com.JavaProgram.PrakashSir;

public class ReversString {
	public static void main(String[] args) {
//		String s="SriRam";//maRirS
//	    for(int i=s.length()-1;i>=0;i--) {
//	    	System.out.print(s.charAt(i));
//	    }
		String s="Chandan";
	    String rev="";
	  for(int i=s.length()-1;i>0;i--){
	   
	     rev=rev+s.charAt(i);
	}

	 System.out.print(rev);
	}

	}

