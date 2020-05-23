package org.cts.test.stringtask;

public class Question2 {
	public static void main(String[] args) {
		//find the particular character index in given String
		String s = "GreensTechnology";
		int a = s.indexOf('o');
		System.out.println("Index of o : "+a);
		
		String s1 = "SeleniumAutomationTool";
		int b = s1.lastIndexOf('o');
		System.out.println("Last Index of o : "+b);
		
		String s2 = "j a v a p r o g r a m";
		int c = s2.indexOf('r');
		System.out.println("Index of r : "+c);
		
		String s3 = "9940015190";
		int d = s3.indexOf('5');
		System.out.println("Index of 5 : "+d);
		
		

	}

}
