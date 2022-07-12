package com.JavaProgram.PrakashSir;

public class AlfiyaJabbar {
	public static void main(String[] args) {
		
		String s="alfiya aabaa jabbar aba";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String ck = str[i];
			for(int j=ck.length()-1;j>0;j--) {
				if(str[i].equals(ck))
					System.out.println(ck);
			}
			
		}
		
	
		
	}

}
