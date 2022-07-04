package com.JavaProgram.MohanSir;

public class PallinodromeNumberWithRange {
	public static void main(String[] args) {
    
		int limit=100;
		for(int  i=0;i<=limit;i++) {
			int num=i;
			int rev=0;
			while(num!=0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
				}
			if(i==rev) {
				System.out.println(i+"pallindrome");
			}
			
		}
	}
}
