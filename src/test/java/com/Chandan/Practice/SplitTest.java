package com.Chandan.Practice;

public class SplitTest {
	public static void main(String[]args) {
		String un="name###user_Name";
		String pwd = "name###userName";
		String login = "id###submitbutton";
		split(un);
		split(pwd);
		split(login);
	}
	
	public static void split(String s) {
		String[] str = s.split("###");
		System.out.println(str[0]);
		System.out.println(str[1]);
		
	}

}
