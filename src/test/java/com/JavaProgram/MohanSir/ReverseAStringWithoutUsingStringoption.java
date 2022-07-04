package com.JavaProgram.MohanSir;

import java.util.Scanner;

public class ReverseAStringWithoutUsingStringoption {
	 public static void main(String[] args) {
         // TODO Auto-generated method stub
//       String str = "Automation";
//         StringBuilder str2 = new StringBuilder();
//         str2.append(str);
//         str2 = str2.reverse();     // used string builder to reverse
//        System.out.println(str2);
//         }
		
		        // TODO Auto-generated method stub
		        String str;
		        Scanner ck = new Scanner(System.in);
		        System.out.println("Enter your String");
		        str = ck.nextLine();
		        String[] token = str.split("");    //used split method to print in reverse order
		       for(int i=token.length-1;i<0;i--) {
		    	   System.out.println((token[i]+""));
		       }
		    }
		 
 

}
