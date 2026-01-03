package tasks;

import java.util.Scanner;

public class EvenOdd_Number {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		if(num %2==0) {
			System.out.println("It's a Even number");
		}
		else {
			System.out.println("It's Odd number");
		}
	}

}
