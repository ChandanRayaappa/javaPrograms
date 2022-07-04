package com.JavaProgram.PrakashSir;

public class FondLeastValueInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"sri","HeeraAnju","Kiara","ck","venkygovinda","kk","bk"};
		String least=s[0];
		for(int i=1;i<s.length;i++) {
			if(least.length()>s[i].length()) {
				least=s[i];
			}
		}
  System.out.println(least);
  for(int j=0;j<s.length;j++) 
  {
	  if(least.length()==s[j].length()) {
		  System.out.println(s[j]);
 
  }
  
  
  
	}

}}
