package tasks.Arrays;

public class SecondHighestArray {
	public static void main(String[] args) {
		int arr[] = new int[] {48,12,94,87,34};
		int max = 0;
		int sec_max = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];	
		}
			if(arr[i]>sec_max && arr[i]!=max) {
				sec_max = arr[i];
			}
	}
		System.out.println("The 2nd highest array:- " + sec_max);

}
}