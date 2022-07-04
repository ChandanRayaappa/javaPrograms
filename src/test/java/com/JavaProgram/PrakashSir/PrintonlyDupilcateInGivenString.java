package com.JavaProgram.PrakashSir;

import java.util.LinkedHashSet;

public class PrintonlyDupilcateInGivenString {
	public static void main(String[] args) {
    String s="Hello am chandan chandan";
     String[] str = s.split(" ");
     LinkedHashSet<String> set = new LinkedHashSet<String>();
     for(int i=0;i<str.length;i++) {
    	 set.add(str[i]);
    	 
    	 //set.remove("chandan");
     }
     for(String data:set) {
    	 int count = 0;
    	 for(int i=0;i<str.length;i++) {
    		 if(data.equals(str[i])) {
    			 count++;
    		 }
    	 }
    	 if(count>1) {
    		 System.out.println(data+"="+count);
    	 }
     }
     
	}
}
