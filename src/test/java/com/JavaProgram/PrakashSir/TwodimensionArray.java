package com.JavaProgram.PrakashSir;

import java.util.ArrayList;
import java.util.Collections;

public class TwodimensionArray {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("u1,u2");
		list.add("u3,u4");
		list.add("u1,u5");
		list.add("u2,u1");
		list.add("u3,u4");
		Collections.sort(list);
		for(String str:list) {
			
			String i1=str.substring(0,2);
			String i2=str.substring(3,5);
			System.out.println(i2);
			if(!i1.equals(i2)) {
				list.add(str);
			}
			 if (!(str.contains(i1) && str.contains(i2)) || !(str.contains(i2) && str.contains(i1))) {
		            System.out.println(str);
		        }
			
		}
		
		
		
			
		}
		
		
		
//		Object[][] data = new Object[5][2];
//		data[0][0]="u1";
//		data[0][1]="u2";
//
//		data[1][0]="u3";
//		data[1][1]="u4";
//
//		data[2][0]="u1";
//		data[2][1]="u5";
//
//		data[3][0]="u2";
//		data[3][1]="u1";
//
//		data[4][0]="u3";
//		data[4][1]="u4";


//		LinkedHashSet<String> set=new LinkedHashSet<String>();
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<2;j++){
//				set.add((String) data[i][j]);
//			}
//		}
//		for(String ch:set) {
//			System.out.println(ch);
//		}
	}

