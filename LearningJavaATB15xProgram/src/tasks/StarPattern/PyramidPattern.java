package tasks.StarPattern;

import java.util.Scanner;

public class PyramidPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=1*i-1;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
