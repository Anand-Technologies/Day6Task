package org.cts.test.stringtask;

public class Question15 {
	public static void main(String[] args) {
		String s = "Welcome To Java class @123";
		int small = 0;
		int caps = 0;
		int number = 0;
		int splchar = 0;
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' & ch <='z') {
				small++;
			}
			else if(ch >= 'A' & ch <= 'Z') {
				caps++;
			}
			else if(ch >= '0' & ch <='9') {
				number++;
			}
			else {
				splchar++;
			}
		}
		System.out.println("Small letters in given input :"+small);
		System.out.println("Capital letters in given input :"+caps);
		System.out.println("Numbers in given input :"+number);
		System.out.println("Special character in given input :"+splchar);
	}
}
