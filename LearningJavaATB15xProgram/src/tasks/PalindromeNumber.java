package tasks;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number");
		int rem, sum=0,temp;
		int num = sc.nextInt();
		temp =num;
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp==sum) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}
	}

}
