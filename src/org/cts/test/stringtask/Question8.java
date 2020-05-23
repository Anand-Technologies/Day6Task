package org.cts.test.stringtask;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
	//Question-8.1
	/*   Scanner sc = new Scanner(System.in);
	   System.out.println("Pls Enter the string input");
	   String s = sc.nextLine();	   
	   String s1 = s.toLowerCase();
	   System.out.println(s1);
	   
	   String s2 = sc.nextLine();
	   String s3 = s.toUpperCase();
	   System.out.println(s3);
	   
	   String s4 = sc.nextLine();
	   char s5 = Character.toUpperCase('n');
	   System.out.println(s5);
	   
	   String s6 = "WelcomE";
	   String s7 = s6.toUpperCase();
	   System.out.println(s7);
	   
	  */
	 //Question-8.4
	   String s = "WelcomE to JavA ClasS";
	   int count = 0;
	   int count1 = 0;
	   int count2 = 0;
	   for(int i=0; i<s.length();i++) {
		   
	   if (s.charAt(i) >='a' && s.charAt(i) <='z') {
		   count++;
		    }
	   else if (s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') {
		   count1++;
            }
		else {
			  count2++;
		   }
	   }
	   System.out.println("Count " +count);
	   System.out.println("Count1 "+count1);
	   System.out.println("Count2 "+count2);		   
   }	   	   
}


