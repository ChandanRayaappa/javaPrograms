package com.JavaProgram.PrakashSir;

import java.util.HashSet;

public class RemoveallDuplicateByusingCollection {
	public static void main(String[] args) {
		int[]  n= {1,2,3,45,5,6,7,8,1};
		//ArrayList<Integer> l = new ArrayList<Integer>();
		HashSet<Integer> l=new HashSet<Integer>();
		for(int i=0;i<n.length;i++) {
			l.add(n[i]);
			//l.removeAll(l);
		}
		
		for(Integer data:l) {
			System.out.println(data);
		}
	}

}
