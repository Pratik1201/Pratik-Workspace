package tasks.Arrays;

import java.util.Scanner;

public class DE2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duplicates elements from the array are: ");
		int arr[] = new int[] {14,67,24,67,14,50};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j] +",");
				}
			}
		}
	}

}
