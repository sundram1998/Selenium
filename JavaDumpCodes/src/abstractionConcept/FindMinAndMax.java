package abstractionConcept;

import java.util.Arrays;

public class FindMinAndMax {
	
	public static void findMinAndMax(int[] arr) {
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		int min=arr[0];
		System.out.println(min+" "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,3,5,67,98};
		findMinAndMax(arr);

	}

}
