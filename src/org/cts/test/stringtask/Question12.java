package org.cts.test.stringtask;

public class Question12 {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String arr[] = s.split(" ");
		for(String temp : arr) {
			System.out.println(temp);
		}
		
		String s1 = "Welcome to Selenium class";
		String arr1[] = s1.split("l");
		for(String temp1 : arr1) {
			System.out.println(temp1);
		}
	}

}
