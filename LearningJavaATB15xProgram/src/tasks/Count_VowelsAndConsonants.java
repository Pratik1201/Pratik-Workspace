package tasks;

import java.util.Scanner;

public class Count_VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		str = str.toLowerCase();
	    int cCount = 0;
	    int vCount = 0;
	       for(int i=0;i<str.length();i++) {
	    	   char ch = str.charAt(i);
	    	   if(ch>='a' && ch<='z') {
	    		   if(ch=='a'||ch == 'e'|| ch=='i'|| ch=='o' ||ch=='u') {
		    		   vCount++; 
	    	   }
	    	     
	    	   else {
	    		   cCount++;
	    	   }
	       }
	       }
	       System.out.println("Vowels in the string are:- "+ vCount);
	       System.out.println("Consonants in the string are:- " + cCount);
	       sc.close();
	}

}
