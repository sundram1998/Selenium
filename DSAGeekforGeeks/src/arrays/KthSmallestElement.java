package arrays;

import java.util.Arrays;

public class KthSmallestElement {
	
	public static int smallest(int[] arr) {
		int s=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<s) {
				s=arr[i];
			}
		}
		return s;	
	}
	
	public static void kthSmallest(int[] arr) {
			
	}
	
	public static void main(String[] args) {

	}
}
