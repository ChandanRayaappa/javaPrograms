package com.JavaProgram.MohanSir;

public class NumberPallidrome {
	public static void main(String[] args) {
		int number=121;
		//int num=number;
		//pallindrome(number);
		System.out.println(pallindrome(number));
	}
	public  static int pallindrome(int num) {
		int rev=0;
		
		while(num!=0) {
			int rem = num%10;
		rev = rev*10+rem;
		num=num/10;
		}

		return rev;
	}
	
	

}
