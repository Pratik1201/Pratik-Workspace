package tasks.StarPattern;

import java.util.Scanner;

public class RightAngleTriangle {
 public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num = sc.nextInt();
	 for (int i=0;i<=5;i++) {
		 for(int j=1;j<i+1;j++) {
			 System.out.print(" *");
		 }
		 System.out.println(); 
	 }
	
 }
}
