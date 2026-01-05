package tasks.Arrays;

public class SmallestElement {
	public static void main(String[] args) {
		int arr [] = new int[] {563,785,342,12,143};
		int min = arr[0];
		for(int i=arr.length-1;i>0;i--) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The smallest element from the array is:- " + min);
	}

}
