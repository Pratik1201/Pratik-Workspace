package tasks.String;

import java.util.Scanner;

public class CharactersInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int count = 0;
		
		System.out.println("The length of string is: " + s.length());
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("count of characters" + count);
		sc.close();
	}

}
