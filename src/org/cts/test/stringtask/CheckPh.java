package org.cts.test.stringtask;

public class CheckPh {
	public static void main(String[] args) {
		String s="9976428098";
	     int a=	s.length();
	     
	     for(int i=0;i<a;i++) {
	    	 
	    	char b= s.charAt(i);
	    	//System.out.println(b);
	    	if((b>='a')&&(b<='z')&&(a==10)) {
	    		System.out.println("Given mobile number is invalid");
	    	}
	    	else  {
                 System.out.println("Given mobile number is valid");
                 }	    		
	    	}
	  System.out.println("please check given input num");		
	}

}
