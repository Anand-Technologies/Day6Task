package org.cts.test.stringtask;

public class Question13 {
	public static void main(String[] args) {
		//Question-13
		String s = "Welcome to java class";
		String s1 = s.substring(7);
		String s2 = s.substring(5, 19);
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "  or Selenium class";
		String s4 = s.concat(s3);
		System.out.println(s4);
	//Question-14
		String s5 = "Welcome";
		System.out.println("Input value is :"+s5);
		int vowels = 0;
		int consonant = 0;
		for(int i=0; i<s5.length(); i++) {
			char ch = s5.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}
			else {
				consonant++;
			}
		}
			System.out.println("Total vowels in string :"+vowels);
			System.out.println("Total consonant in string :"+consonant);		
	}
}
