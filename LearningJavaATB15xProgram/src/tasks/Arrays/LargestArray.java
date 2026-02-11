package tasks.Arrays;

public class LargestArray {
	public static void main(String[] args) {
		int arr[] = new int[] {123,96,14,56,43};
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The largest element from an array is: " + max);
	}

}
