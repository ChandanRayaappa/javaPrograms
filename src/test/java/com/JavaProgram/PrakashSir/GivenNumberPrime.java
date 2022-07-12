package com.JavaProgram.PrakashSir;

public class GivenNumberPrime {
	public static void main(String[] args) {
		           for(int i=2;i<10;i++) {
                    int num=i;
					int j=2;
					while(num>=j) {
						if(num%j==0) {
							break;
						}
						else {
							j++;
						}
					}
		           
						if(num==j) {
							System.out.println(num+"prime number");
						}
						else {
							System.out.println("not prime number");
						}
					}
	}
				}
				




