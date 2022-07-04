package com.JavaProgram.PrakashSir;

import java.util.Scanner;

public class ScannerPrime {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n[]=new int[5];
		int count=0;
		for(int i=0;i<5;i++) {
			n[i]=in.nextInt();
			for(int j=0;j<5;j++) {
				for(int k=1;k<=n[j];k++) {
					if(n[j]%k==0) {
						count++;
					}
					if(count==2) {
						System.out.print(n[j]+" ");
						count=0;
					}
				}
			}
		}
	}

}
