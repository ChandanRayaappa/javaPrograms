package com.JavaProgram.PrakashSir;

import java.util.Scanner;

public class ScannerPrime {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int j=2;
		while(n>=j) {
			if(n%j==0) {
				break;
				}
			else {
				j++;
			}
			}
		
           if(n==j) {
        	   System.out.println(n);
           }

		}

	}
