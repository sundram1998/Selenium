package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoSortedArray {

	public static void union(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;

		HashSet<Integer> aList = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			aList.add(a[i]);
		}
		for(int i:b) {
			aList.add(i);
		}
		
		System.out.println(aList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 5, 3, 10, 12, 13, 14, 15 };
		union(a, b);

	}

}
