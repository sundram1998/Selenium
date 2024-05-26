package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
	
	public static void test1(int[] arr) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		for(int i:arr) {
			aList.add(i);
		}
		HashSet<Integer> hashSet=new HashSet<Integer>(aList);
		System.err.println(hashSet);
	}

	public static void removeDuplicates(int[] arr) {
		int i = 1;//{ 1, 2, 2, 3, 3, 4, 4 ,5,9,9};
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i-1]) {
				arr[i] = arr[j];
				i++;
			}
		}
		for(int k=0;k<i;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void removeDuplicate(int[] arr) {
		int i = 0;// { 1, 2, 2, 3, 3, 4, 4 ,5,9,9};
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];			
			}
		}
		for(int k=0;k<=i;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	
	public static void test(int[] arr) {
		ArrayList<Integer> aList = new ArrayList<>();
        for (int num : arr) {
            aList.add(num);
        }
        HashSet<Integer> set = new HashSet<>(aList);
        System.out.println(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2,2,3,4,5,5};
//		removeDuplicates(nums);
//		removeDuplicate(nums);
		test1(nums);
	}

}
