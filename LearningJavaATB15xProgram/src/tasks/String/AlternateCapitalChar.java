package tasks.String;

import java.util.Scanner;

public class AlternateCapitalChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
			 sb.append(Character.toLowerCase(s.charAt(i)));
			}
			else {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println(sb);
	}

}
