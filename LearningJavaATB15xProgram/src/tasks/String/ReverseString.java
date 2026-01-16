package tasks.String;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String revs = "";
		
		for(int i=s.length()-1;i>=0;i--) {
		revs = revs +s.charAt(i);	
		}
		
		System.out.println("Reverse string is:- " + revs);
	}
	
}
