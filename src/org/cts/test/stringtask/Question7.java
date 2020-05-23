package org.cts.test.stringtask;

public class Question7 {
	//Question 7.1
	public static void main(String[] args) {
		String s = "Welcome to class JAVA";
		String s1 = s.replace("JAVA", "SQL");
		System.out.println(s1);
		
		String s2 = s.replace('W', 'Z');
		System.out.println(s2);
		
		String s3 = s.replaceAll(s, "Going");
		System.out.println(s3);
	//Question- 7.2
		String s4 = "Greens Adayar";
		String s5 = s4.replace("Adayar", "OMR");
		System.out.println(s5);
	//Questio- 7.3
		String s6 = "Welcome to Java Class";
		String s7 = s6.replace(' ', '#');
		System.out.println(s7);
	//Question- 7.4
		String s8 = "anandyuvan994@gmail.com";
		boolean a = s8.contains("gmail");
		System.out.println("Given email id contains gmail or not  :"+a);
		System.out.println("Before replace the given input :"+s8);
		String s9 = s8.replace("gmail", "yahoo");
		System.out.println("After replace the given input is :"+s9);
	//Question-7.5
		String s10 = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		boolean b = s10.contains("6261");
		System.out.println("Given input address contains pincode :"+b);
		String s11 = s10.replace("626101","   ");
		System.out.println("After replace the pincode to space :" +s11);
		
		
		
		 
		
	}
}
