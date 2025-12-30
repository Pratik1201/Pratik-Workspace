package tasks;

import java.util.Scanner;

public class Classfication_of_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = sc.nextInt();
		System.out.println("Enter the second value");
		int b = sc.nextInt();
		System.out.println("Enter the thirdvalue");
		int c = sc.nextInt();
		
		if (a==b && b==c) {
			System.out.println("It's an Equilateral triangle");
			
		}
		else if(a==b || b==c || c==a) {
			System.out.println("It's an Isosceles triangle");
		}
		else {
			System.out.println("It's a Scalene triangle");
			
		}
	}

}
