package org.cts.test.stringtask;

public class Question10 {
	public static void main(String[] args) {
		String s = "Anand";
		String s1 = "anand";
		int a = s1.compareToIgnoreCase(s);
		System.out.println(a);
		
		String s2 = "And";
		String s3 = "anand";
		int b = s2.compareTo(s3);
		System.out.println(b);
	}

}
