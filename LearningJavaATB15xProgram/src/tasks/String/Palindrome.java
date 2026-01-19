package tasks.String;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String st = sc.nextLine();
		String reverse ="";
		
		for(int i= st.length()-1;i>=0;i--) {
			reverse = reverse + st.charAt(i);
		}
		if(reverse.equalsIgnoreCase(st)) {
			System.out.println("It is a Palindrome string");
		}
		else {
			System.out.println("It is not a Palindrome string");
		}
	}

}
