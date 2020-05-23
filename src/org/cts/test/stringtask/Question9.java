package org.cts.test.stringtask;

public class Question9 {
	public static void main(String[] args) {
		//check whether string startswith welcome
		String s = "Welcome to java class";
		boolean a = s.startsWith("Welcome");
		System.out.println("Given input string startswith Welcome ?  :"+a);
		
		String s1 = "Hi i am Anand";
		boolean b = s1.endsWith("class");
		System.out.println("Given input is endswith class ?  :"+b);
		
		String s2 = "Welcome to my home";
		boolean c = s2.isEmpty();
		System.out.println("Given input is empty or not :"+c);
		
		String s3 = "";
		boolean d = s3.isEmpty();
		System.out.println("Given inpu tis empty or not :"+d);
			
	}
}
