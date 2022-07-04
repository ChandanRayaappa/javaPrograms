package com.JavaProgram.MohanSir;

public class PrintUniqueCharInStirng {
	public static void main(String[] args) {
		String s = "chandan";//op vkyrcd	  
		String duplicate = s;
		String result="";
		for(int i=0;i<s.length()-1;i++) {
			char ch1=s.charAt(i);
			int c=0;
			for(int j=1;j<duplicate.length()-1;j++) {
				char ch2=duplicate.charAt(j);
				if (ch1==ch2&&i>j) 
					break;
				if(ch1==ch2)
					c++;
				if(c==1)
				{
					System.out.println(ch1);
				}
			}

			// System.out.print(c);
		}/*
		String s = "venkyheerachandan";//op vkyrcd
		 String duplicate = s;

		  for(int i=0;i<s.length()-1;i++) {
			 if (s.charAt(i)!=s.charAt(i+1)) {
				 System.out.print(s.charAt(i)+" ");
			 }
		  }*/

	}
}


