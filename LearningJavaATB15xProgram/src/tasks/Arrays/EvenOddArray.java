package tasks.Arrays;

public class EvenOddArray {
	
	public static void main(String [] args) {
		int arr[] = new int[] {01,64,15,70,14,92,05};
		
		System.out.println("Even numbers are:- ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+ " ");
			}
		}
		System.out.println("Odd numbers are:- ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i] +" ");
			}
		}
	}

}
