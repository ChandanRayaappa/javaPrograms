package com.JavaProgram.MohanSir;

import java.util.LinkedHashSet;

public class PrintCharCamparision {
	public static void main(String[] args) 
	{
		String s="india";//o/p=in id ii ia nd ni na di da
		char[] c = s.toCharArray();
		LinkedHashSet<String> l=new LinkedHashSet<>();
		for (int i = 0; i < c.length; i++) 
		{

			for (int j = i+1; j < c.length; j++) 
			{
				String temp = "";
				if(i!=j)
				{
				temp=c[i]+""+c[j];
				l.add(temp);
				} 
			}
		}
		for (String st : l) 
		{
			System.out.print(st+" ");
		}

	}

}
