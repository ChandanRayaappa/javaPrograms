package com.Chandan.Practice;

public class TrimTest {
	public static void main(String[]args) {
		String s1="ChandanKumar";
		String s2="ChandanKumar  ";
		if(s1.equals(s2.trim())) {
			System.out.println("Same");
		}
		else {
			System.out.println("not same");
		}
	}

}
