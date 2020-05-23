package org.cts.test.stringtask;

public class Question16 {
	public static void main(String[] args) {
		String s = "Welcome";
		
		char ch[] = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			
			if(ch[i] =='a' | ch[i]=='e' | ch[i]=='i' | ch[i]=='o' | ch[i]=='u') {
				System.out.println(s.replace( ch[i],'@')); 
			}	
		}
	}
}

