package org.cts.test.stringtask;

public class Question11 {
	public static void main(String[] args) {
		String s1 = "Anand";
		String s2 = "Anand";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		String s3 = new String("Anand");
		String s4 = new String("Anand");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	
		String s5 = new String("Anand");
		String s6 = new String("Yuvan");
		String s7 = new String("AnandYuvan");
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7));
		
		String s8 = "Anand";
		String s9 = "Yuvan";
		String s10 = "AnandYuvan";
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		System.out.println(System.identityHashCode(s10));


	}

}
