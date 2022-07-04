package com.JavaProgram.MohanSir;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=1;
		int c=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				c++;		
			}
		}
		if(c==2) {
			System.out.println("hai i am prime number");
		}
		else
		{
			System.out.println("hai i am not prime number");
		}

	}

}