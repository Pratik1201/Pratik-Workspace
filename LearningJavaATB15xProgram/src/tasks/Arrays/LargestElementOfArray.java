package tasks.Arrays;

public class LargestElementOfArray {
	public static void main(String[] args) {
		int arr[] = new int[] {154,212,512,999,420,345};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("The largest element from array is "+ max);
		}
	}

