package org.cts.test.stringtask;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
	//get the email id from user and check whether @ present or not - Question 5.1
		Scanner ac = new Scanner(System.in);
		String s = "@";
		System.out.println("pls Enter the input ");
		String s1 = ac.nextLine();
		System.out.println("Input from user is :"+s1);
		boolean a = s1.contains(s);
		System.out.println("Given input contains '@' : "+a);
		
	//Get the address from the user and check whether address have pincode or not - Question 5.2
		System.out.println("Pls enter the input address");
		String s2 = "600";
		String s3 = ac.nextLine();
		if( s3.contains(s2)) {
			System.out.println("Given address is Valid");
		}
		else {
			System.out.println("Given address is InValid");
		}
		
	//get the mobile number from user and check whether any character present or not- Question 5.4
		String s4 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Pls enter the input of Mobile number");
		String s5 = ac.nextLine();
		boolean b = s5.contains(s4);
		System.out.println("Given input has valid or not : "+b);
	}
}
