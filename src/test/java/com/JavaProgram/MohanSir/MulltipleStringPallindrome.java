package com.JavaProgram.MohanSir;

public class MulltipleStringPallindrome {
	public static void main(String[] args) {
				String[] arr= {"chandan","sri", "amma","appa"};
				
			
				
		for(int i=0;i<arr.length;i++) {
			 String a = arr[i];
			 System.out.print(a+" ");
				String	rev ="";
			for(int j=a.length()-1;j>=0;j--) {
				
				rev=rev+a.charAt(j);
				
			}
			System.out.println(rev);

		
		if(rev.equals(a)) {
			System.out.println(rev+"is palindrome");

		}
		else {
		
		System.out.println("not a pallindrome");
		}
		
	}
	}
    
}
