package tasks.Arrays;

public class SumOfArray {
public static void main(String[] args) {
	int arr[] = new int[] {12,01,19,94};
	int sum = 0;
	
	for (int i=0;i<arr.length;i++) {
		sum = arr[i]+sum;
	}
	System.out.println("Sum of array is:- " +sum);
}
}
