package org.cts.test.stringtask;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the first input ");
	String s = sc.nextLine();
	System.out.println("Enter the second input ");
	String s1 = sc.nextLine();
	boolean a = s.equals(s1);
	System.out.println("Given Input is equal or not : "+a);
	
	System.out.println("Enter the third input");
	String s2 = sc.nextLine();
	System.out.println("Enter the fourth input");
	String s3 = sc.nextLine();
	boolean b = s2.equalsIgnoreCase(s3);
	System.out.println("Given Input is equal or not : "+b );
	
	System.out.println("Pls enter the input String");
	String s4 = sc.nextLine();
	System.out.println("Pls enter the input String");
	String s5 = sc.nextLine();
	boolean c = s4.equals(s5);
	System.out.println("Given input in equals or not  : "+c);
	
	String s6 = "Greens technology";
	String s7 = "GreensTechnology";
	boolean d = s6.equalsIgnoreCase(s7);
	System.out.println("Given input is equals or not : "+d);
	
	}
}
