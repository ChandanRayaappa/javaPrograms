package com.JavaProgram.MohanSir;

public class PrintDuplicateString {
	public static void main(String[] args) {
		char ch2=' ';
		char ch=' ';
		String s="HeeraAngelFerndaez";
		String name = s.toLowerCase();
		String dupli = name;
		for(int i=0;i<name.length();i++) {
			 ch = name.charAt(i);
			 int c=0;
			for(int j=0;j<dupli.length();j++) {
				 ch2 = dupli.charAt(j);
				 if(ch==ch2)
					{
						c++;
						break;
						
					}
			}
			if(c>1)
			{
				System.out.print(ch);
			}
		}
		
	}

}
