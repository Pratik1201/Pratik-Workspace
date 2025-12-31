package tasks;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter year");
		int year = sc.nextInt();
		if(year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println(year + " : It's a leap year");
		}
		else {
			System.out.println(year + " : It's not a leap year");
		}
	}
}
 